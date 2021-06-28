package com.microservices.practise.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {


	@GetMapping("/userServiceFallBack")
	public String userServiceFallbackMethod() {
		return "User service is taking longer than expected";
	}





	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod() {
		return "department service is taking longer than expected";
	}

}
