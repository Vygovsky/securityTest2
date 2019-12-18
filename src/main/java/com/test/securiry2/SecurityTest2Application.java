package com.test.securiry2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;


@SpringBootApplication(exclude = UserDetailsServiceAutoConfiguration.class)
/*@EnableJpaRepositories(basePackageClasses = UserRepository.class)*/
public class SecurityTest2Application {

	public static void main(String[] args) {
		SpringApplication.run(SecurityTest2Application.class, args);
	}

}
