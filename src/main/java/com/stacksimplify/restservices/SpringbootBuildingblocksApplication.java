package com.stacksimplify.restservices;

import java.util.Locale;

//import com.stacksimplify.restservices.mappers;
//import org.mybatis.spring.annotation;

//import org.mapstruct.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
//import org.springframework.web.bind.annotation.Mapping;

//
@SpringBootApplication
//@MapperScan({"com.stacksimplify.*.mappers","com.stacksimplify.*.mapper"})
/*
 * from Q and A regarding the UserMapper bean
@EnableAutoConfiguration(exclude = { ErrorMvcAutoConfiguration.class })

@ComponentScan(basePackages = {"com.stacksimplify.restservices"})

@EntityScan("com.stacksimplify.restservices.entities")

@EnableJpaRepositories("com.stacksimplify.restservices.repositories")


 */




public class SpringbootBuildingblocksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBuildingblocksApplication.class, args);
	}
	
	@Bean
	public LocaleResolver localeResolver() {
		AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		return localeResolver;
	}
	
	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
