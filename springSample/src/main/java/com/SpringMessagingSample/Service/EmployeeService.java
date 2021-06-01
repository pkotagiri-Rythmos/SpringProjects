package com.SpringMessagingSample.Service;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

import org.springframework.messaging.MessagingException;

public class EmployeeService {
	@ServiceActivator(inputChannel = "employee.channel")
	public void recieveMessage(Message<?> message) throws MessagingException {
		System.out.println("###employee.channel###");
		System.out.println(message);
		System.out.println(message.getPayload());
	}

}
