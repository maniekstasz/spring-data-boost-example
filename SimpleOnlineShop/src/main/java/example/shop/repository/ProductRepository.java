package example.shop.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import example.shop.model.Product;

@RepositoryRestResource
public interface ProductRepository extends
		PagingAndSortingRepository<Product, Long> {

}
