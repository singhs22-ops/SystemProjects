package com.packageDemo.March21.VehicleParking.restCalls;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.packageDemo.March21.VehicleParking.Common.AssignVehicle;
import com.packageDemo.March21.VehicleParking.Common.VehicleClass;



@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/leaf")
public class RestCalls {

	public RestCalls() {
		// TODO Auto-generated constructor stub
	}
	
	VehicleClass veh;
	AssignVehicle Aveh;
	
	
	
	@GetMapping("/home")
	public String home1() {
		return "HHHHH";
	}
	
	@GetMapping("/capacity/{cap}")
	public boolean assign(@PathVariable int cap) {
		boolean ret =Aveh.setCapacity(cap);
		return ret;
	}
	
	@PostMapping("/assignVehicledetails")
	public String assignVehicledetails(){
		    if(Aveh.getCurrentSet()<Aveh.getCapacity()) {
		    	Aveh.AddVehicleDetails();
		    	return "Details Stored";		    	
		    }
		    
		return "No Response";
	}
	
	@PostMapping("/deleteFromSlot/{regNum}")
	public String deleteFromSlot(@PathVariable String regNum) {
		Aveh.deleteSlot(regNum);
		
		return "Done";
	}
	
	@PostMapping("/getSlot")
	public int getSlot() {
		return Aveh.getSlot();
	}
	
	
	
}
