package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.hcl.dao.EmployeeTimingsDAO;
import com.hcl.exception.RecordNotFoundException;

@Service
public class EmployeeTimingService {

	@Autowired
	EmployeeTimingsDAO employeeDao;

	public List<Object[]> getTimingsById(Integer id) throws Exception {
		if (employeeDao.findSwipeInAndSwipeOutByID(id) == null
				&& (employeeDao.findSwipeInAndSwipeOutByID(id).isEmpty())) {
			throw new RecordNotFoundException("Record Not found for id" + id);
		}
		return employeeDao.findSwipeInAndSwipeOutByID(id);
	}

	public List<Object[]> getTimingsByLocation(String location) throws Exception {
		if (employeeDao.findSwipeInAndSwipeOutByLocation(location) == null
				&& (employeeDao.findSwipeInAndSwipeOutByLocation(location).isEmpty())) {
			throw new RecordNotFoundException("Record Not found for location" + location);
		}
		return employeeDao.findSwipeInAndSwipeOutByLocation(location);
	}

}
