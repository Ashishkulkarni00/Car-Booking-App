package com.ride_booking_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ride_booking_system")
public class RideBookinSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RideBookinSystemApplication.class, args);
	}

}
