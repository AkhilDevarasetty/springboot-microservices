package com.microservices.practise.departmentservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.practise.departmentservice.entity.Department;
import com.microservices.practise.departmentservice.repository.DepartementRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartementRepository deptRepo;

	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment of DepartmentService");
		return deptRepo.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("Inside findDepartmentById of DepartmentService");
		System.out.println(deptRepo.findByDepartmentId(departmentId));
		return deptRepo.findByDepartmentId(departmentId);
	}

}
