package example.shop.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import example.shop.model.Address;

@RepositoryRestResource()
public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {

}
