package com.idigital.farmerassistant.productms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@EnableSwagger2
@SpringBootApplication
public class ProductMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductMsApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.idigital.farmerassistant.productms.controller"))
				.build()
				.apiInfo(new ApiInfo("Product Microservice", "API CREATION", "1.0", "Free to Use", new Contact("Leela", "https://www.youtube.com/channel/UCli0bOCbYDvitOiFkj-4YzQ?view_as=subscriber", "leela@gmail.com"), "API licence", "https://www.linkedin.com/in/Manileela", Collections.emptyList()));

		}
	}
