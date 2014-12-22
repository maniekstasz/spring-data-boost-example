package example.shop.model;

import java.util.List;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "excerpt", types = Shop.class)
public interface ShopExerpt {
	
	
}
