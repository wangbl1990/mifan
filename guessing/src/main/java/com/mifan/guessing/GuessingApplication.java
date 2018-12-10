package com.mifan.guessing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
@MapperScan("com.mifan.guessing.dao.mapper")
public class GuessingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuessingApplication.class, args);
	}

	@Bean
	@Order(1)
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter( this.jwtAuthenticationFilter());
		registrationBean.addUrlPatterns("/app/*","/boss/*");
		return registrationBean;
	}

	@Bean
	public JwtAuthenticationFilter jwtAuthenticationFilter() {
		return new JwtAuthenticationFilter();
	}

}
