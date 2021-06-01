package com.SpringMessagingSample.springRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.SpringMessagingSample.Model.Employee;

public interface EmployeeRepo extends MongoRepository<Employee, Integer>{

}
