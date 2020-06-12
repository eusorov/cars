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
	String getConfig();
//	@Value("#{target.backtestJson()}")
//	JsonNode getBacktest();
	long getDatefrom();
	long getDateto();
	
}
