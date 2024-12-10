package com.poc.restservice;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {


	    @Override
	    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
	        // Registra o tipo MIME personalizado
	        configurer.mediaType("xpto", MediaType.valueOf("application/xpto.com"));
	    }
}
