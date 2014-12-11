package example.shop.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import example.shop.model.Shop;

@RepositoryRestResource
public interface ShopRepository extends PagingAndSortingRepository<Shop, Long> {

}
