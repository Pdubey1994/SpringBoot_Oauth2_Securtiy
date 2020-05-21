package com.pineapple.soft.configurations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
@EnableWebSecurity
public class ApplcationSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	
	

	
	
	
	
	


	@Bean
	public BCryptPasswordEncoder  passwordEncoder()
	{
		
		BCryptPasswordEncoder bCryptPasswordEncoder =new BCryptPasswordEncoder();
		
		return bCryptPasswordEncoder;
	}




	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
		http.csrf().disable()
		 .authorizeRequests()
		 .antMatchers("/").permitAll()
			.antMatchers("/successfullyRegistration").permitAll()
			.antMatchers("/forgotPassword").permitAll()
			.antMatchers("/newRegistration").permitAll() 
			.antMatchers("/admin").hasAuthority("ADMIN").anyRequest()
			.authenticated().and().csrf().disable();
			
		
	}
	


}
