/**
 * 
 *//*
package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

*//**
 * @author 371243
 *
 *//*
@Configuration
public class SpringBootSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// Authentication (Map each user to respective roles)
		auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance()).withUser("user").password("password")
				.roles("USER").and().withUser("admin").password("password").roles("USER", "ADMIN");
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeRequests().antMatchers("/addAlien**").hasRole("USER")
		.antMatchers("/addAlien/**").hasRole("ADMIN").and()
		.csrf().disable().headers().frameOptions().disable();
	}

}
*/