package de.usomi.cars.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.fasterxml.jackson.databind.JsonNode;

@Projection(
		  name = "customBacktest", 
		  types = { Backtest.class }) 
public interface CustomBacktest {

	@Value("#{target.id}")
	Integer getId(); 
	String getMethod();
	String getAsset();
	String getCurrency();
	
	@Value("#{target.toJson(target.config)}")
	Object getConfig();
	
	@Value("#{target.toJson(target.performance)}")
	Object getPerformance();
	
	long getDatefrom();
	long getDateto();
	
}
