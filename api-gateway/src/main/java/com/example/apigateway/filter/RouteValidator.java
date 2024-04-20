package com.example.apigateway.filter;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.function.Predicate;

@Component
public class RouteValidator {

    public static final Set<String> publicApi = Set.of("/auth", "/eureka", "/public");

    public Predicate<ServerHttpRequest> isSecured =
            request -> publicApi
                    .stream()
                    .noneMatch(uri -> request.getURI().getPath().contains(uri));

}
