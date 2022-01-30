package com.example.oauth2_demo;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DemoController {
    @GetMapping("/hello")
    String helloUser(@AuthenticationPrincipal OidcUser user) {
        return "Hello " + user.getAttributes().get("email");
    }
}
