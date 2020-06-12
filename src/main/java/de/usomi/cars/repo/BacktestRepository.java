package de.usomi.cars.repo;
import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import de.usomi.cars.model.Backtest;
//import io.swagger.v3.oas.annotations.OpenAPIDefinition;
//import io.swagger.v3.oas.annotations.info.Contact;
//import io.swagger.v3.oas.annotations.info.Info;
//import io.swagger.v3.oas.annotations.info.License;
//import io.swagger.v3.oas.annotations.Operation;
//
//
//@OpenAPIDefinition(
//        info = @Info(
//        title = "the title",
//        version = "0.0",
//        description = "My API",
//        license = @License(name = "Apache 2.0", url = "http://foo.bar"),
//        contact = @Contact(url = "http://gigantic-server.com", name = "Fred", email = "Fred@gigagantic-server.com")
//        )
//)
import de.usomi.cars.model.CustomBacktest;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "backtests", path = "backtests", excerptProjection=CustomBacktest.class)
public interface BacktestRepository extends PagingAndSortingRepository<Backtest, Integer>{
	
//	@RestResource(path = "backtestbyid")
//	public Optional<Backtest> findById(Integer id);

}
