package com.example.userservice.security;

import com.example.security.BaseJwtProvider;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import java.util.Date;
import java.util.Map;

@Component
public class JwtProvider extends BaseJwtProvider {

    @Value("${spring.security.jwt.expiration_time}")
    private Long EXPIRATION_TIME;

    // mã hóa dữ liệu
    private static final String PRIVATE_KEY_FILE = "../../../private_key.pem";

    public String generateTokenRSA(String email) throws Exception {
        return Jwts.builder()
                .setSubject(String.format("%s", "username"))
                .setIssuer("Your Application")
                .setIssuedAt(new Date())
                .setClaims(null)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(getPrivateKey(), SignatureAlgorithm.RS256)
                .compact();
    }

    public String doGenerateToken(Map<String, Object> claims, String subject) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(subject)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME * 60))
                .signWith(SignatureAlgorithm.HS512, "SECRET_KEY").compact();
    }


    private PrivateKey getPrivateKey() throws Exception {
        byte[] privateKeyBytes = Base64.getDecoder().decode(PRIVATE_KEY_FILE);
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(privateKeyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(spec);
    }

}
