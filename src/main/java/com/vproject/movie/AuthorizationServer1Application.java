package com.vproject.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableAuthorizationServer
public class AuthorizationServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationServer1Application.class, args);
	}

}
