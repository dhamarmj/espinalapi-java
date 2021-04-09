package com.sps.espinalapi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import Controllers.ClienteController;


@SpringBootApplication
@ComponentScan(basePackageClasses = ClienteController.class)
public class EspinalapiApplication {


	public static void main(String[] args) {
		SpringApplication.run(EspinalapiApplication.class, args);
	}

}
