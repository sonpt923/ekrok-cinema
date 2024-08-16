package com.example.userservice.entity.google;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    private String iss;

    private String azp;

    private String aud;

    private String sub;

    private String hd;

    private String email;

    private Boolean email_verified;

    private Integer nbf;

    private String name;

    private String picture;

    private String given_name;

    private String family_name;

    private String locale;

    private Integer iat;

    private Integer exp;

    private String jti;

}
