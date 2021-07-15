# KeyCloak_SpringBoot_Demo
A Keycloak Spring Boot használatának demoja. 
## Keycloak
Egy docker alapú Keycloak telepítés megteszi https://www.keycloak.org/getting-started/getting-started-docker .
A Keycloak felületen található realm-ban egy user-t elláttam egy role-al ami alapján meghatározhatóak az engedélyei a felhasználónak a Spring Boot alkalmazásban.
## Spring Boot demo 
A Spring Boot alkalmazás egy példa, egy get és egy post van implementálva és ezeken lehet tesztelni a role-based autentikációt. 
Az autentikált API híváshoz szükséges egy Token-t generáltatni a megfelelő token api endpoint-on a Keycloak-al. Szükséges a Keycloak client, user és jelszó a token generálásához illetve az endpoint.
