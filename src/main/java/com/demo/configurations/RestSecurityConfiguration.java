package com.demo.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.demo.services.AccountService;

@EnableWebSecurity
@Configuration
public class RestSecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired
	private AccountService accountService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers(HttpMethod.GET,"/api/invoice/**")
		.permitAll()
		.antMatchers(HttpMethod.GET,"/api/demo/**").access("hasRole('ROLE_DAUCATMOI')")
		.antMatchers(HttpMethod.GET,"/api/product/**").access("hasRole('ROLE_DAUCATMOI') or hasRole('ROLE_DEONODIACHI')")
		.antMatchers(HttpMethod.GET,"/api/category/**").access("hasRole('ROLE_DAUCATMOI') or hasRole('ROLE_THANGUCVIET') or hasRole('ROLE_DEONODIACHI')" )
		.and()
		.csrf().disable()
		.formLogin().disable();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception{
		builder.userDetailsService(accountService);
	}
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
}
