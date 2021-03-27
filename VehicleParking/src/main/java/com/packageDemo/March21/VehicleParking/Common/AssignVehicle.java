package com.packageDemo.March21.VehicleParking.Common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AssignVehicle {

	public AssignVehicle() {
		// TODO Auto-generated constructor stub	
		
	}
	public int capacity;
	public int currentSet;


	VehicleClass veh =new VehicleClass();
	
	List<VehicleClass> Obj = new ArrayList<VehicleClass>();
	
    public int getCapacity() {
		return capacity;
	}
	public boolean setCapacity(int capacity) {
		this.capacity = capacity;
		return true;
	}


    public void AddVehicleDetails() {
    	
    	if(getCurrentSet() <getCapacity()) {
	    	@SuppressWarnings("resource")
			Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	        System.out.println("Enter Registration nUmber");
	        String regNum = myObj.nextLine();  // Read registrationNumber as input
	        System.out.println("Enter color");
	        String Color = myObj.nextLine();  // Read Color input
	
	        veh.setRegNum(regNum);
	        veh.setColor(Color);
	        
	        Obj.add(veh);
	        setCurrentSet(Obj.size());
    }
    	
    }

	public int getCurrentSet() {
		return this.Obj.size();
	}
	public void setCurrentSet(int currentSet) {
		this.currentSet = currentSet;
	}
	public int getSlot(){
		
		return getCurrentSet();
		
	}
	public boolean deleteSlot(String regNum){
		for(VehicleClass vehObj: Obj) {
			if(vehObj.getRegNum()==regNum) {
				System.out.println("Object Found");
				Obj.remove(vehObj);
				return true;
			}
		}
		return false;
		
	}
}
