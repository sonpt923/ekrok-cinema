package com.example.userservice.security;

import com.example.userservice.entity.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Component
public class JwtProvider {

    private final String PUBLIC_KEY = "";

    private final String PRIVATE_KEY = "";

    //    @Value("${spring.security.jwt.expiration_time}")
    private Integer EXPIRATION_TIME;

    //    @Value("${spring.security.jwt.secret_key}")
    private String SECRET_KEY;


    public Boolean isTokenExpired(String token) {
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.after(new Date());
    }

    public Date getExpirationDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }

    public String getUsernameFromToken(String token) {
        token = token.substring(7);
        return getClaimFromToken(token, Claims::getSubject);

    }

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = getAllClaimsFromTokenByKey(token);
        return claimsResolver.apply(claims);
    }

    public Claims getAllClaimsFromTokenByKey(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
    }


}
