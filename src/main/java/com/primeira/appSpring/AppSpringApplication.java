package com.primeira.appSpring;

import com.primeira.appSpring.program.ArduinoSerialCommunication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppSpringApplication.class, args);
		new ArduinoSerialCommunication();
		ArduinoSerialCommunication.main(args);
	}
}
