import { KeycloakService } from 'keycloak-angular';

export function initializeKeycloak(keycloak: KeycloakService) {
    return () =>
        keycloak.init({
            config: {
                url: 'https://test.unilms.com/auth',
                realm: 'techsolutions',
                clientId: 'techsolutions-web'
            },
            initOptions: {
                checkLoginIframe: true,
                checkLoginIframeInterval: 300,
                onLoad: 'check-sso',
                silentCheckSsoRedirectUri:
                    window.location.origin + '/assets/silent-check-sso.html'
            }
        });
}