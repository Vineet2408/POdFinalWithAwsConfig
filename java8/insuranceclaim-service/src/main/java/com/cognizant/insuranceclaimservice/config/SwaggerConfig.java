package com.cognizant.insuranceclaimservice.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket swaggerConfiguration(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.cognizant.insuranceclaimservice"))
				.build()
				.apiInfo(apiDetails());   
		
	}
	private ApiInfo apiDetails() {
    	return new ApiInfo(
    			"Insurance Claim API","Final API for Insurance Claim", 
    			"1.0.0", "Free to use",
    			new springfox.documentation.service.Contact("POD - 2 ","abc.com","abc@def.com"), 
    			"API License","Welcome to Insurance Claim API",Collections.emptyList());
    }
}
