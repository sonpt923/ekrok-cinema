package com.example.config;

import com.example.dto.common.MessageResponseDTO;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice
@EnableWebMvc
public class WrapResponseHandler implements ResponseBodyAdvice<Object>, HandlerInterceptor {

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        ServletServerHttpRequest servletServerRequest = (ServletServerHttpRequest) request;
        if (!(body instanceof MessageResponseDTO) && (returnType.getMethodAnnotation(IgnoreWrapResponse.class) != null ||
                (returnType.getDeclaringClass().getAnnotation(EnableWrapResponse.class) == null))) {
            return body;
        }

        MessageResponseDTO msg = new MessageResponseDTO().build(body);
        msg.setPath(servletServerRequest.getServletRequest().getRequestURI());

        return msg;
    }
}
