package example.shop.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Data;

@Entity
@Data
public class Category extends AbstractPersistable<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6131139361106044223L;

	private String name;
	private Boolean active;

	@OneToMany(mappedBy = "category")
	private List<Product> products;

	public Category() {
	}

	public Category(String name) {
		this.name = name;
		this.active = true;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
		for (Product product : this.products)
			product.setCategory(this);

	}

}
