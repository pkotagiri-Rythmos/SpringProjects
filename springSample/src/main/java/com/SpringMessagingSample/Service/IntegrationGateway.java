package com.SpringMessagingSample.Service;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

public interface IntegrationGateway {

	@Gateway(requestChannel = "router.channel")
	public <T> void process(T object);
}
