package com.example.userservice.config;

import com.example.userservice.utils.Constant;
import jakarta.annotation.PostConstruct;
import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeycloakMasterConfig {

    @Value("${keycloak.url.base}")
    private String urlBase;

    @Value("${keycloak.client.master.id}")
    private String clientIdMaster;

    @Value("${}")
    private String clientSecretMaster;

    @Value("${keycloak.url.token_master_endpoint}")
    private String tokenMasterEndpoint;

    @Value("${keycloak.username}")
    private String username;

    @Value("${keycloak.password}")
    private String password;

    private Keycloak keycloak;

    @PostConstruct
    public void init() {
        keycloak = KeycloakBuilder.builder()
                .clientId(clientIdMaster)
                .clientSecret(clientSecretMaster)
                .grantType(OAuth2Constants.CLIENT_CREDENTIALS)
                .serverUrl(tokenMasterEndpoint)
                .realm(Constant.Realm.MASTER)
                .password(password)
                .username(username)
                .build();
    }
}
