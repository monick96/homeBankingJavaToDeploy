package com.mindhub.Homebanking.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Configuration
//@EnableSwagger2
//public class SwaggerConfiguration {
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                // Specifies the base package where drivers are located.
//                .apis(RequestHandlerSelectors.basePackage("com.mindhub.Homebanking.controllers"))
//                // Specify the routes (endpoints) to want to document. In this case, all of them.
//                .paths(PathSelectors.any())
//                .build()
//                // Personalizar la información de la API que se mostrará en Swagger UI.
//                .apiInfo(apiInfo());
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("API de Homebanking") // Título de la API
//                .description("API para acceder a los servicios de Homebanking") // Descripción de la API
//                .version("1.0.0") // Versión de la API
//                .contact(new Contact("Monica Melgarejo", "", "monibrave1@gmail.com")) // Información de contacto
//                .build();
//    }
//}
