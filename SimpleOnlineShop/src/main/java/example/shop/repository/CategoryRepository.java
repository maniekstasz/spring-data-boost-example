package example.shop.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import example.shop.model.Category;

@RepositoryRestResource
public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {

}
