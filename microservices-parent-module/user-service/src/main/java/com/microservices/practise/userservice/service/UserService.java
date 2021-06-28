package com.microservices.practise.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.practise.userservice.VO.Department;
import com.microservices.practise.userservice.VO.ResponseTemplateVO;
import com.microservices.practise.userservice.entity.User;
import com.microservices.practise.userservice.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired 
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("Inside saveUser of UserService");
		return userRepo.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		log.info("Inside getUserWithDepartment of UserService");
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepo.findByUserId(userId);
		System.out.println("User------------------->"+user);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+ user.getDepartmentId(), Department.class);
		System.out.println(department);
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}

	
}
