package example.shop.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import example.shop.model.User;
import example.shop.model.UserExerpt;

@RepositoryRestResource(excerptProjection=UserExerpt.class)
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
