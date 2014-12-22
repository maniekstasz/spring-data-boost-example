package example.shop;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.hateoas.core.EmbeddedWrapper;

import example.shop.model.User;

@RepositoryEventHandler
public class DtoHandler {

//	@Autowired
//	private EmbeddedWrapperFactory wrappers;
//
//	@DtoPopulatorHandler(value = User.class, dtos = "details")
//	public List<EmbeddedWrapper> populateUserDto(User user, String dto) {
//		Map<String, String> weather = new HashMap<String, String>();
//		weather.put("origin", "Imię " + user.getUsername() + " wywodzi się z mitologi jakiejś tam");
//		weather.put(
//				"details",
//				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
//		return Arrays.asList(wrappers.wrap(weather, "nameDetails", false));
//	}
}
