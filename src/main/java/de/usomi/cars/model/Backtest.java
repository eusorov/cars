package de.usomi.cars.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;

// import org.springframework.data.annotation.Id;

// import lombok.Value;

@Data // vs @Value (immutable variant of data)
@Entity
public class Backtest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	String method;
	String asset;
	String currency;
	long datefrom;
	long dateto;
	//Double profit;?
	String config;
	String backtest;
	

	Backtest() {
		this.id = null;
		this.asset = "";
		this.backtest = "";
		this.currency = "";
		this.datefrom = 0;
		this.dateto = 0;
		//this.profit = 0d;
		this.config = "";
		this.method = "";

	}
	
	public JsonNode backtestJson() throws JsonMappingException, JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(this.backtest);
		return jsonNode;
	}
}
