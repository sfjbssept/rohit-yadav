package com.rabbit.producer;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;import com.rabbit.config.MessagingConfig;
import com.rabbit.entity.Employee;
import com.rabbit.entity.EmployeeStatus;


@RestController
@RequestMapping("/Employee")
public class EmployeePublisher {
	
	
	@Autowired
	private RabbitTemplate template;
	

	@PostMapping("/")
	public String saveEmployee(@RequestBody Employee employee ) {
		employee.setEmpId(UUID.randomUUID().toString());
		
		EmployeeStatus employeeStatus = new EmployeeStatus( employee, "Joined", "Has recently joined the company and is going through the on-boarding porcess in " );
		template.convertAndSend(MessagingConfig.EXCHANGENAME, MessagingConfig.ROUTING_KEY, employeeStatus);
		return "Success!";
		
	}
	
}
