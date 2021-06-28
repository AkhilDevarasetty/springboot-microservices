package com.microservices.practise.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.practise.departmentservice.entity.Department;

@Repository
public interface DepartementRepository extends JpaRepository<Department, Long>{

	Department findByDepartmentId(Long departmentId);

}
