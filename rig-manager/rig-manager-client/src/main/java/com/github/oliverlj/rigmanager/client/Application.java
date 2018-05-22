package com.github.oliverlj.rigmanager.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.github.oliverlj.rigmanager.client.services.OperatingSystemService;

/**
 * Entry point of rig manager client.
 * @author Olivier LE JACQUES
 *
 */
@SpringBootApplication
public class Application {
	
	@Autowired
	private OperatingSystemService operatingSystemService;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            operatingSystemService.testCurrentOperatingSystemIsSupported();
        };
    }

}
