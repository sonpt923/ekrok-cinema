package com.example.userservice.security;

import com.example.security.BaseJwtProvider;
import org.springframework.stereotype.Component;

@Component
public class JwtProvider extends BaseJwtProvider {

    private static final String PUBLIC_KEY_FILE = "../../../public_key.pem";


}
