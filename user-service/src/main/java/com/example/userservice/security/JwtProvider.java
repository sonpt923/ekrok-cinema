package com.example.userservice.security;

import com.example.security.BaseJwtProvider;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.signers.RSADigestSigner;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtProvider extends BaseJwtProvider {

    private static final String PUBLIC_KEY_FILE = "../../../public_key.pem";

    public String generateTokenRSA(String email) {

        Signer signer = null;

        Map<String, Object> claims = new HashMap<>();
        JwtBuilder builder = Jwts.builder()
                .setClaims(claims)
                .setSubject(email);
        return "Bearer " + builder.compact();
    }

    //


}
