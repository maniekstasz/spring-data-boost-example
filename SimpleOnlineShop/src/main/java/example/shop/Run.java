package example.shop;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import example.shop.model.Address;
import example.shop.model.Category;
import example.shop.model.Product;
import example.shop.model.Product.State;
import example.shop.model.Shop;
import example.shop.model.User;
import example.shop.model.Product.Location;
import example.shop.repository.CategoryRepository;
import example.shop.repository.ProductRepository;
import example.shop.repository.UserRepository;

@Component
public class Run implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Category gry = new Category("gry");
		Category telefony = new Category("telefony");

		List<Product> telefonyProdukty = Arrays.asList(new Product("LG", 200.00, Location.POLAND, State.NEW), new Product("Samsung", 670.00, Location.EUROPE,
				State.BRAND_NEW), new Product("Iphone", 1200.00, Location.WORLD, State.OLD), new Product("HTC", 700.00, Location.POLAND, State.NEW),
				new Product("BlackBerry", 500.00, Location.WORLD, State.NEW), new Product("Nokia", 20.00, Location.POLAND, State.OLD));
		telefony.setProducts(telefonyProdukty);

		List<Product> gryProdukty = Arrays.asList(new Product("WOW", 200.00, Location.EUROPE, State.NEW), new Product("LOL", 670.00, Location.EUROPE,
				State.BRAND_NEW), new Product("GTA", 1200.00, Location.WORLD, State.OLD), new Product("NFS", 700.00, Location.EUROPE, State.BRAND_NEW),
				new Product("FIFA", 500.00, Location.WORLD, State.NEW), new Product("PES", 20.00, Location.POLAND, State.OLD));
		gry.setProducts(gryProdukty);

		Address krakow = new Address("Kraków", "123", "Krakowska", "33-100");
		Address warszawa = new Address("Warszawa", "123", "Warszawska", "33-100");
		Address katowice = new Address("Katowice", "123", "Katowicka", "33-100");
		Address kielce = new Address("Kielce", "123", "Kielecka", "33-100");

		User tomasz = new User("tomasz", "password", krakow);
		User bartek = new User("bartek", "password", warszawa);

		Shop telefonyShop = new Shop("GSM", katowice);
		Shop gryShop = new Shop("Gry", kielce);

		telefonyShop.setProducts(telefonyProdukty);
		gryShop.setProducts(gryProdukty);

		tomasz.setShops(Arrays.asList(telefonyShop));
		bartek.setShops(Arrays.asList(gryShop));

		categoryRepository.save(telefony);
		categoryRepository.save(gry);
		userRepository.save(tomasz);
		userRepository.save(bartek);

		//
		// List<Product> products = new ArrayList<Product>();
		// for (int i = 0; i < 20; i++) {
		// products.add(new Product("product_" + i, new Double(i * 100)));
		// }
		// Category cat = new Category("category");
		// User user = new User("user", "password", products);
		// categoryRepository.save(cat);
		// cat.setProducts(products);
		// userRepository.save(user);
	}
}
