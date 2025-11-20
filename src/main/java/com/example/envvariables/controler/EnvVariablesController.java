package com.example.envvariables.controler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvVariablesController {

    @GetMapping("/env")
    ResponseEntity<String> getEnvVariables(@Value("${db.user}") String dbUser) {
        System.out.println("DB_DEFAULT_USER env var: " + System.getenv("DB_DEFAULT_USER"));
        System.out.println("DB_PROD_USER env var: " + System.getenv("DB_PROD_USER"));
        System.out.println("All env vars: " + System.getenv());
        return ResponseEntity
                .ok()
                .body(dbUser);
    }

}
