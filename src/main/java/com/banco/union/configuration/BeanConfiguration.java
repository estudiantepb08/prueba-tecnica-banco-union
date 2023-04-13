package com.banco.union.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.banco.union.pojo.ResponseConsultores;
import com.banco.union.utils.FormatDate;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public FormatDate formatDate() {
		return new FormatDate();
	}

	@Bean
	public ModelMapper modelMapper(){ return new ModelMapper(); }
		
}
