package example.shop;

import java.net.URI;
import java.net.URISyntaxException;

import openrest.config.OpenRestConfiguration;
import openrest.query.StaticFilterFactory;
import openrest.security.config.OpenRestSecurityConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EntityScan
@Import(OpenRestSecurityConfiguration.class)
public class Application extends OpenRestConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		super.configureRepositoryRestConfiguration(config);
		try {
			config.setBaseUri(new URI("/api"));
			config.metadataConfiguration().setAlpsEnabled(false);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
	@Bean
	public Tescik tescik(){
		return new Tescik();
	}
	
	public static class Tescik{
		private String name = "Iphone";
		
		public String getSrutu(){
			return name;
		}
		
		public Boolean man(){
			return true;
		}
	}
	

	// @Bean
	// public AclRegister aclRegister() {
	// AclRegister aclRegister = new AclRegister();
	// aclRegister.register(User.class, new
	// PermitAcl().functions(Part.Type.SIMPLE_PROPERTY).dtos("staszek","shops2").expands("shops",
	// "shops.products").build());
	// return aclRegister;
	// }

	// @Bean
	// public DtoHandler dtoHandler(){
	// return new DtoHandler();
	// }
	//
	// @Bean
	// public EventHandler eventHandler(){
	// return new EventHandler();
	// }
}
