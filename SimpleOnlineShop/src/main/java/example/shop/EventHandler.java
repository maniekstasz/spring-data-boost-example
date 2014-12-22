package example.shop;

//import openrest.event.annotation.HandleAfterCollectionGet;
//import openrest.event.annotation.HandleAfterGet;
//import openrest.event.annotation.HandleBeforeCollectionGet;
//import openrest.event.annotation.HandleBeforeGet;
//import openrest.webmvc.ParsedRequest;

import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.hateoas.PagedResources;

import example.shop.model.User;

@RepositoryEventHandler
public class EventHandler {

//	@HandleBeforeCollectionGet(User.class)
//	public void onBeforeCollection(ParsedRequest request) {
//		System.out.println(request.getDomainClass());
//	}
//
//	@HandleBeforeGet(User.class)
//	public void onBefore(ParsedRequest request) {
//		System.out.println(request.getDomainClass());
//	}
//
//	@HandleAfterCollectionGet(User.class)
//	public void onAfterCollection(PagedResources resource) {
//		System.out.println(resource.getMetadata().getSize());
//	}
//
//	@HandleAfterGet(User.class)
//	public void onAfterCollection(PersistentEntityResource resource) {
//		System.out.println(resource.getContent());
//	}

}
