package com.example.userservice.config;

import com.example.utils.Constants;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.springframework.beans.factory.annotation.Value;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KeycloakMasterConfig {

    @Value("${url.base}")
    private String urlBase;

    @Value("${client.id.master}")
    private String clientIdMaster;

    @Value("${client.secret.master}")
    private String clientSecretMaster;

    @Value("${url.token_master_endpoint}")
    private String tokenMasterEndpoint;

    private Keycloak keycloak;

//    @PostConstruct
//    public void init() {
//        keycloak = KeycloakBuilder.builder() //
//                .serverUrl(urlBase) //
//                .realm(Constants.Realm.MASTER) //
//                .grantType(OAuth2Constants.CLIENT_CREDENTIALS) //
//                .clientId(clientIdMaster) //
//                .clientSecret(clientSecretMaster) //
//                .build();
//    }


}
