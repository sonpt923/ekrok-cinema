package com.example.userservice.security;

import com.example.security.JwtHelper;
import com.example.userservice.entity.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtProvider  {

    //    @Value("${spring.security.jwt.expiration_time}")
    private Integer EXPIRATION_TIME;

    //    @Value("${spring.security.jwt.secret_key}")
    private String SECRET_KEY;


    public String generateToken(User user) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("username", user.getUpdatedBy());
        claims.put("name", user.getName());
        claims.put("email", user.getEmail());
        claims.put("birth_day", user.getBirthDay());
        claims.put("role", user.getRole());
        claims.put("status", user.getStatus());
        claims.put("created_by", user.getCreatedBy());
        claims.put("updated_by", user.getUpdatedBy());
        claims.put("created_time", user.getCreatedTime());
        claims.put("updated_time", user.getUpdatedTime());
        return doGenerateToken(claims, user.getUsername());
    }

//    public Boolean isTokenExpired(String token) {
//        final Date expiration = getExpirationDateFromToken(token);
//        return expiration.after(new Date());
//    }

//    public Date getExpirationDateFromToken(String token) {
//        return getClaimFromToken(token, Claims::getExpiration);
//    }

    private String doGenerateToken(Map<String, Object> claims, String username) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME * 60000000))
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY).compact();
    }


}
