package com.test.securiry2.securityTest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
/*@EnableJpaRepositories(basePackageClasses = UserRepository.class)*/
public class SecurityTest2Application {

	public static void main(String[] args) {
		SpringApplication.run(SecurityTest2Application.class, args);
	}

}
