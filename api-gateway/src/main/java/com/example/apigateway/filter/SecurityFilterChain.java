package com.example.apigateway.filter;

import com.example.apigateway.repository.TokenCacheRepository;
import com.example.apigateway.service.feign.UserService;
import com.example.exception.ValidationException;
import com.example.security.BaseJwtProvider;
import com.example.utils.BaseConstants;
import com.example.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Component
public class SecurityFilterChain extends OncePerRequestFilter {

    private static final Logger log = LoggerFactory.getLogger(SecurityFilterChain.class);

    @Autowired
    private RouteValidator validator;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private BaseJwtProvider jwtProvider;

    @Autowired
    private TokenCacheRepository tokenCacheRepository;

    @Autowired
    private UserService userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        if (validator.isSecure.test(request)) {

            String authenKey = request.getHeader("authen-key");
            if (StringUtil.stringIsNullOrEmty(authenKey)) {
                throw new ValidationException(BaseConstants.ERROR_NOT_NULL, "authen-key");
            }
            String token = String.valueOf(tokenCacheRepository.findById(authenKey));
            if (!StringUtil.stringIsNullOrEmty(token)) {
                // kiem tra xem co the giai nen token do ra hay khong
                String username = jwtProvider.getUsernameFromToken(token);
                Long time = redisTemplate.getExpire(authenKey, TimeUnit.MINUTES);
                if (time < 19L) {
                }
                jwtProvider.getExpirationDateFromToken(token);
                // kiem tra jwt token nếu token heest han thi tao moi token va gui lai cho fe
            }
        }
        filterChain.doFilter(request, response);
    }

}
