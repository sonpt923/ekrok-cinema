package com.example.apigateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class AuthenticationFilter extends AbstractGatewayFilterFactory {

    private static final Logger log = LoggerFactory.getLogger(AuthenticationFilter.class);

    @Autowired
    private RouteValidator validator;

    @Autowired
    private WebClient.Builder webClient;

    public GatewayFilter apply(Object config) {
        return ((exchange, chain) -> {
            if (validator.isSecured.test(exchange.getRequest())) {
                if (!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
                    throw new RuntimeException("missing authorization header");
                }
                String authHeader = exchange.getRequest().getHeaders().get(HttpHeaders.AUTHORIZATION).get(0);
                if (authHeader != null && authHeader.startsWith("Bearer ")) {
                    authHeader = authHeader.substring(7);
                }
                try {
                    Mono<ResponseEntity> mono = webClient.build().get()
                            .uri("lb://user-service/public/hello")
                            .retrieve().bodyToMono(ResponseEntity.class);

                    mono.subscribe(s -> {
                        System.out.println(s);
                    });
                } catch (Exception e) {
                    throw new RuntimeException(e.getMessage());
                }
            }
            return chain.filter(exchange);
        });
    }
}
