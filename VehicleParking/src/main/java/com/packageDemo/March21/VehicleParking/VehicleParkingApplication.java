package com.packageDemo.March21.VehicleParking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.packageDemo.March21.VehicleParking.Common.AssignVehicle;

@SpringBootApplication
public class VehicleParkingApplication {

	public static void main(String[] args) {
		System.out.print("HEY");
		SpringApplication.run(VehicleParkingApplication.class, args);
	
	}
	AssignVehicle Avh= new AssignVehicle();

}
