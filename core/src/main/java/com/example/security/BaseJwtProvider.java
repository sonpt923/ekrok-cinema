package com.example.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Date;
import java.util.function.Function;

@Component
public class BaseJwtProvider {

    // giải mã duwxlieeuj
    private static final String PUBLIC_KEY_FILE = "public_key.pem";

    //    @Value("${spring.security.jwt.secret_key}")
    private String SECRET_KEY;


    public String getUsernameFromToken(String token) {
        token = token.substring(7);
        return getClaimFromToken(token, Claims::getSubject);
    }

    public Date getExpirationDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = getAllClaimsFromTokenByKey(token);
        return claimsResolver.apply(claims);
    }

    private Claims getAllClaimsFromTokenByKey(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
    }

    public Object getAllClaimsFromToken(String token) throws NoSuchAlgorithmException, InvalidKeySpecException {
        Base64.Decoder decoder = Base64.getUrlDecoder();
        String[] chunks = token.split("\\.");
        String header = new String(decoder.decode(chunks[0]));
        String payload = new String(decoder.decode(chunks[1]));
        ObjectMapper objectMapper = new ObjectMapper();
        try {
//            UserInfo payloadObject = objectMapper.readValue(payload, UserInfo.class);
            return payload;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean isTokenExpired(String token) {
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.after(new Date());
    }

    public String getKeyStringFromFile(String pathFile) {
        return "";
    }

    private PublicKey getPublicKey() throws Exception {
        byte[] publicKeyBytes = Base64.getDecoder().decode(getKeyStringFromFile(PUBLIC_KEY_FILE));
        X509EncodedKeySpec spec = new X509EncodedKeySpec(publicKeyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePublic(spec);
    }

    public boolean validateAccessToken(String token) throws Exception {
        try {
            Jwts.parserBuilder().setSigningKey(getPublicKey()).build().parseClaimsJws(token);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    private Claims parseClaims(String token) throws Exception {
        return Jwts.parserBuilder()
                .setSigningKey(getPublicKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

}
