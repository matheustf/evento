package com.evento;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import com.google.gson.Gson;

@Configuration
@ConditionalOnClass(Gson.class)
@ConditionalOnMissingClass(value = "com.fasterxml.jackson.core.JsonGenerator")
@ConditionalOnBean(Gson.class)
public class CustomConfiguration {

	@Bean
	public GsonHttpMessageConverter gsonHttpMessageConverter(Gson gson) {
		GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
		converter.setGson(gson);
		return converter;
	}

}
