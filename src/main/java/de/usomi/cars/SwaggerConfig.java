package de.usomi.cars;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import lombok.extern.slf4j.Slf4j;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import static springfox.documentation.builders.PathSelectors.*;

@Configuration
@EnableSwagger2WebMvc
@Slf4j
@Import(SpringDataRestConfiguration.class)
public class SwaggerConfig {
  @Bean
  public Docket api() {
	  log.info("Configuration SwaggerConfig");
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.any())
        // .apis()
       // .paths(regex("/backtests"))
        .paths(PathSelectors.any())
        .build();
  }
}