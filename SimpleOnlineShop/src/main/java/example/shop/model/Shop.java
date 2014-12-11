package example.shop.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@Entity
public class Shop extends AbstractPersistable<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8526457060458720791L;

	private String name;

	@ManyToOne(optional=false, fetch=FetchType.LAZY)
	private User user;

	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Address> addresses;

	@OneToMany(mappedBy = "shop", cascade = CascadeType.ALL)
	private List<Product> products;

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
