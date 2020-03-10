package com.hcl.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Employee;


public interface EmployeeTimingsDAO extends JpaRepository<Employee, Integer> {

	@Query("select e.swipeIn,e.swipeOut from Employee where e.id='id' ")
	 List<Object[]> findSwipeInAndSwipeOutByID(Integer id);

	@Query("select e.swipeIn,e.swipeOut from Employee where e.location='location' ")
	 List<Object[]> findSwipeInAndSwipeOutByLocation(String location);

}
