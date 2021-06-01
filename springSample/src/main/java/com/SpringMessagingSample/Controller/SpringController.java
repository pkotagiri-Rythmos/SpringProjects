package com.SpringMessagingSample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.SpringMessagingSample.Model.EmpDetails;
import com.SpringMessagingSample.Model.Employee;
import com.SpringMessagingSample.Service.IntegrationGateway;

public class SpringController {
	@Autowired
	private IntegrationGateway integrationGateway;

	@PostMapping("/employee")
	public void processStudentDetails(@RequestBody Employee emp) {
		integrationGateway.process(emp);
	}

	@PostMapping("/empdetails")
	public void processAddressDetails(@RequestBody EmpDetails empDet) {
		integrationGateway.process(empDet);
	}

}
