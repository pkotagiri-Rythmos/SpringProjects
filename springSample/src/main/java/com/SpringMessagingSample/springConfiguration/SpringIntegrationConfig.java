package com.SpringMessagingSample.springConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.router.PayloadTypeRouter;
import org.springframework.messaging.MessageChannel;

import com.SpringMessagingSample.Model.EmpDetails;
import com.SpringMessagingSample.Model.Employee;

@Configuration
@EnableIntegration
@IntegrationComponentScan
public class SpringIntegrationConfig {
	@Bean
	public MessageChannel recieverChannel() {
		return new DirectChannel();
	}

	 @Bean
	 public MessageChannel replyChannel() {
	return new DirectChannel();
	}
	 @ServiceActivator(inputChannel = "router.channel")
		@Bean
		public PayloadTypeRouter payloadRouter() {
			PayloadTypeRouter router = new PayloadTypeRouter();
			router.setChannelMapping(Employee.class.getName(), "employee.channel");
			router.setChannelMapping(EmpDetails.class.getName(), "empdetails.channel");
			return router;
		}
	
}
