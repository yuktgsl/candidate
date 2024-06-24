package es.catapult.interview.candidates.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "PlaceHolderApi", url = "${place.holder.api.users.url}")
public interface PlaceholderUsersApi {

	@GetMapping(value = "/")
	List<PlaceholderUserDao> all();

	@GetMapping(value = "/{id}")
	PlaceholderUserDao get(@PathVariable("id") long id);
}
