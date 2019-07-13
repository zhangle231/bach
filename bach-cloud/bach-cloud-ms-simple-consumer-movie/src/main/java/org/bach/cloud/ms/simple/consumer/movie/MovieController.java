package org.bach.cloud.ms.simple.consumer.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
	
	@Value("${user.userServiceUrl}")
	private String userServiceUrl;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/user/{id}")
	public User findById(@PathVariable Long id) {
		return this.restTemplate.getForObject(this.userServiceUrl + id, User.class);
	}

}
