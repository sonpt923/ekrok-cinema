package com.example.apigateway.filter;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Set;
import java.util.function.Predicate;

@Component
public class RouteValidator {

    public static final Set<String> publicApi = Set.of("eureka", "public", "auth");

    public Predicate<HttpServletRequest> isSecure =
            serverHttpRequest -> publicApi
                    .stream()
                    .noneMatch(uri -> serverHttpRequest.getRequestURI().contains(uri));

}
