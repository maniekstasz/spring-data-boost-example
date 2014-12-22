package example.shop.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import openrest.query.StaticFilter;
import openrest.security.response.filter.SpelFilter;

import org.springframework.data.jpa.domain.AbstractPersistable;

//@Data
@Entity
@SpelFilter(value="1==1", properties = "name")
@StaticFilter(value = "eq(id,1)", name = "new_shop")
public class Shop extends AbstractPersistable<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8526457060458720791L;

	private @Getter @Setter String name;

	@ManyToOne(optional=false, fetch=FetchType.EAGER)
	private @Getter @Setter User user;

	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private @Getter @Setter List<Address> addresses;

	@OneToMany(mappedBy = "shop", cascade = CascadeType.ALL)
	private @Getter @Setter List<Product> products;

	public Shop(String name, Address address) {
		super();
		this.name = name;
		this.addresses = new ArrayList<Address>(1);
		this.addresses.add(address);
	}

	public Shop() {
	}

	public void setProducts(List<Product> products) {
		this.products = products;
		for (Product product : this.products)
			product.setShop(this);

	}
	
}
