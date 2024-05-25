package com.example.userservice.security;

import com.example.security.JwtHelper;
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
public class JwtProvider extends JwtHelper {

    //    @Value("${spring.security.jwt.expiration_time}")
    private Integer EXPIRATION_TIME;

    //    @Value("${spring.security.jwt.secret_key}")
    private String SECRET_KEY;


    public String generateToken(User user) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("code", user.getCode());
        claims.put("email", user.getEmail());
        claims.put("birth_day", user.getBirthDay());
        claims.put("role", user.getRole());
        return doGenerateToken(claims, user.getCode());
    }

    public Boolean isTokenExpired(String token) {
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.after(new Date());
    }

    public Date getExpirationDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }

    private String doGenerateToken(Map<String, Object> claims, String username) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME * 60000000))
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY).compact();
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
