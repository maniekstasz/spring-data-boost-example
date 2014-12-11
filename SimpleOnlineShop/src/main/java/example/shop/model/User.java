package example.shop.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import openrest.response.filter.SpelFilter;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Data
@SpelFilter(value="filteredObject.username == 'bartek'", properties="password")
public class User extends AbstractPersistable<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2902271887674358698L;

	private String username;
	private String password;

	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private Address address;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Shop> shops;

	public User() {
	}

	public User(String username, String password, Address address) {
		super();
		this.username = username;
		this.password = password;
		this.address = address;
	}

	public void setShops(List<Shop> shops) {
		this.shops = shops;
		for (Shop shop : this.shops)
			shop.setUser(this);

	}

}
