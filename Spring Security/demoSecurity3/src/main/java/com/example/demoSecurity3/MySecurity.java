package com.example.demoSecurity3;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.UserDetailsManagerConfigurer.UserDetailsBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableWebSecurity
public class MySecurity extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication()
		.withUser("abc")
		.password("xyz")
		.roles("USER");
	
	}
	

	@Bean
	public PasswordEncoder getPasswordEncoder() {
	        return NoOpPasswordEncoder.getInstance();
	    }
	@RestController
	public class MyController {
		@GetMapping("/")
		public String home() {
			String s1= "<h1>Hello World </h1>";
			String s2="<br><a href=/logout>logout</a>";
			return s1+s2;
		}
	

	}
}