package example.shop;

import java.net.URI;
import java.net.URISyntaxException;

import openrest.config.OpenRestConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.http.MediaType;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EntityScan
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
}
