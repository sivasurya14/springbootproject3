//package com.example.car;
//
//import java.net.PasswordAuthentication;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class LoginConfiguration extends WebSecurityConfigurerAdapter {
//
////	@Override
//
//	protected void configure (AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("sivasuriyan").password("$2a$10$oM1ALUS5RPffn2pJ5xPOdOxG0a04xMsnK2nAHts02BEte1Zw9Ndkm").roles("student").and()
//		.withUser("Dinesh").password("$2a$10$Pii0wiEonzWuG5yiTKqD7evcsfT0iKWLGR.AfnoRBX8NBaT9/wqn2").roles("manager").and()
//		.withUser("Davitha").password("$2a$10$I33QOHiaSg22AjUCiFEo3uuMhnAFlGLGiZJJjASm7fW5EEJ9heubS").roles("trainer");		
//	}
////	@Bean
////	public PasswordEncoder getpassPasswordNO() {
////		return NoOpPasswordEncoder.getInstance();
//// }
//	 @Bean
//	 public PasswordEncoder getPassword() {
//	 return new BCryptPasswordEncoder(10);
//	 }
//	@Override
//	protected void configure (HttpSecurity http) throws Exception {		
//		http.authorizeHttpRequests().antMatchers("/getStudents").hasRole("student");
//		http.authorizeHttpRequests().antMatchers("/getTrainer").hasAnyRole("trainer","manager");
//		http.authorizeHttpRequests().antMatchers("/getManager").hasAnyRole("student","trainer","manager");
//		//http.authorizeHttpRequests().antMatchers("/getStudents").permitAll().and().formLogin();		
//		}
////	@Autowired
////	RoleService rollsvc;
////
////	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////		auth.userDetailsService(rollsvc);
////	}
////
////	@Bean
////	public PasswordEncoder getpassword() {
////		return NoOpPasswordEncoder.getInstance();
////	}
//
//}
