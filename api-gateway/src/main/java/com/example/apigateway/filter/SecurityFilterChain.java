package com.example.apigateway.filter;

import com.example.apigateway.repository.TokenCacheRepository;
import com.example.security.BaseJwtProvider;
import com.example.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class SecurityFilterChain extends OncePerRequestFilter {

    private static final Logger log = LoggerFactory.getLogger(SecurityFilterChain.class);

    @Autowired
    private RouteValidator validator;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private BaseJwtProvider jwtProvider;

    @Autowired
    private TokenCacheRepository tokenCacheRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if (validator.isSecure.test(request)) {
            // check xem co dung bat da ubang api-auth-token
            String authenKey = request.getHeader("authen-key");
            String token = String.valueOf(tokenCacheRepository.findById(authenKey));
            if (!StringUtil.stringIsNullOrEmty(token)) {
                // kiem tra xem co the giai nen token do ra hay khong

                // kiem tra thoi gian token do con song duoc bao lau

                // neu thoi gian con song < thoi gian quy dinh

                // tang thoi gian ttl

                // kiem tra jwt token nếu token heest han thi tao moi token va gui lai cho fe

            }
            // trường hợp null thi tra ra loi
        }
        filterChain.doFilter(request, response);
    }

}
