package de.usomi.cars;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import de.usomi.cars.model.Customer;
import de.usomi.cars.repo.CustomerRepository;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@EnableSwagger2 
//@EnableSwagger2WebMvc
//@Import(SpringDataRestConfiguration.class)
@SpringBootApplication
public class CarsApplication {

	private static final Logger log = LoggerFactory.getLogger(CarsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CarsApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
	    return new WebMvcConfigurer() {
	    	  @Override
		        public void addCorsMappings(CorsRegistry registry) {
		            registry.addMapping("/**")
		            .allowedOrigins("*");
		           // .allowedMethods("PUT", "DELETE", "GET", "POST")
		           // .allowedHeaders("Content-Type", "api_key", "Authorization")
		           // .allowCredentials(true).maxAge(3600);
		        }
	    };
	}

//	@Bean
//	  public Docket api() {
//	    return new Docket(DocumentationType.SWAGGER_2)
//	        .select()
//	        .apis(RequestHandlerSelectors.any())
//	        .paths(PathSelectors.any())
//	        .build();
//	  }
	
//	@Bean sss
//	public CommandLineRunner demo(CustomerRepository repository) {
//		return (args) -> {
//			// save a few customers
//			repository.save(new Customer("Jack", "Bauer"));
//			repository.save(new Customer("Chloe", "O'Brian"));
//			repository.save(new Customer("Kim", "Bauer"));
//			repository.save(new Customer("David", "Palmer"));
//			repository.save(new Customer("Michelle", "Dessler"));
//
//			// fetch all customers
//			log.info("Customers found with findAll():");
//			log.info("-------------------------------");
//			for (Customer customer : repository.findAll()) {
//				log.info(customer.toString());
//			}
//			log.info("");
//
//			// fetch an individual customer by ID
//			Customer customer = repository.findById(1L);
//			log.info("Customer found with findById(1L):");
//			log.info("--------------------------------");
//			log.info(customer.toString());
//			log.info("");
//
//			// fetch customers by last name
//			log.info("Customer found with findByLastName('Bauer'):");
//			log.info("--------------------------------------------");
//			repository.findByLastName("Bauer").forEach(bauer -> {
//				log.info(bauer.toString());
//			});
//			// for (Customer bauer : repository.findByLastName("Bauer")) {
//			// log.info(bauer.toString());
//			// }
//			log.info("");
//		};
//	}

}
