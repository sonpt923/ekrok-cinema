FROM quay.io/keycloak/keycloak:24.0.5

COPY user-service/src/main/resources/theme /opt/keycloak/themes

ENTRYPOINT ["/opt/keycloak/bin/kc.sh"]
