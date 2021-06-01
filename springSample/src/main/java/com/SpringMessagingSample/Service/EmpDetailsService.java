package com.SpringMessagingSample.Service;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessagingException;
@MessageEndpoint

public class EmpDetailsService {

	@ServiceActivator(inputChannel = "Empdetails.channel")
	public void recieveMessage(Message<?> message) throws MessagingException {

		System.out.println(message);
		System.out.println(message.getPayload());
	}

}
