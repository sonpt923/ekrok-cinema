package com.example.userservice.security;

import com.example.security.BaseJwtProvider;
import com.example.userservice.service.ApDomainService;
import com.example.userservice.utils.Constant;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtProvider extends BaseJwtProvider {

    @Autowired
    private ApDomainService apDomainService;

    private static final String PRIVATE_KEY_FILE = "../../../private_key.pem";


    public String generateTokenRSA(String username) throws Exception {
        Map<String, Object> clams = new HashMap<>();
        return doGenerateToken(clams, username);
    }

    public String doGenerateToken(Map<String, Object> claims, String subject) throws Exception {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(subject)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() +
                        Long.valueOf(apDomainService.getByCode(Constant.AP_DOMAIN.OTP_CODE).getValue())))
                .signWith(getPrivateKey(), SignatureAlgorithm.RS256).compact();
    }

    private PrivateKey getPrivateKey() throws Exception {
        byte[] privateKeyBytes = java.util.Base64.getDecoder().decode(getKeyStringFromFile(PRIVATE_KEY_FILE));
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(privateKeyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(spec);
    }

}
