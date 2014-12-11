package example.shop.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import openrest.query.StaticFilter;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Getter;
import lombok.Setter;

@Entity
@StaticFilter(value="eq(state,'NEW');or;eq(state,'BRAND_NEW')", name="new_products")
public class Product extends AbstractPersistable<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2395145150186163602L;

	public enum Location {
		POLAND, EUROPE, WORLD
	}

	public enum State {
		NEW, OLD, BRAND_NEW
	}

	private @Getter @Setter String name;
	private @Getter @Setter Double price;
	private @Getter @Setter Location location;
	private @Getter @Setter State state;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private @Getter @Setter Category category;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private @Getter @Setter Shop shop;

	public Product() {
	}

	public Product(String name, Double price, Location location, State state) {
		super();
		this.name = name;
		this.price = price;
		this.location = location;
		this.state = state;
	}

}
