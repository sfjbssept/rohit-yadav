package com.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpingSecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.httpBasic().and().authorizeRequests()
		.antMatchers(HttpMethod.POST,"/post").hasAnyRole("ADMIN")
		.antMatchers(HttpMethod.GET,"/get").hasAnyRole("USER")
		.antMatchers(HttpMethod.PUT,"/put").hasAnyRole("ADMIN", "USER").and().csrf().disable().headers()
		.frameOptions().disable();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
		authenticationManagerBuilder.inMemoryAuthentication().withUser("user123").password("{noop}password").roles("USER").and()
		.withUser("admin123").password("{noop}password").roles("ADMIN").and().withUser("test123").password("{noop}password").roles("USER")
		.and().withUser("admin1").password("{noop}password").roles("ADMIN");
		
	}
}
