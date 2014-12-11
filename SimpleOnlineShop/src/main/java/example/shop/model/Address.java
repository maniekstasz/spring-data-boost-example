package example.shop.model;

import javax.persistence.Entity;

import lombok.Data;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Data
public class Address extends AbstractPersistable<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6237558088345043846L;
	private String city;
	private String homeNr;
	private String street;
	private String zip;

	public Address(String city, String homeNr, String street, String zip) {
		super();
		this.city = city;
		this.homeNr = homeNr;
		this.street = street;
		this.zip = zip;
	}

	public Address() {

	}
}
