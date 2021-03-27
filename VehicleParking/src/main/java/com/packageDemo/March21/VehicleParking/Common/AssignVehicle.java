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


    public void AddVehicleDetails(String regNumcolor) {
    	
	    	/*@SuppressWarnings("resource")
			Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	        System.out.println("Enter Registration nUmber");
	        String regNum = myObj.nextLine();  // Read registrationNumber as input
	        System.out.println("Enter color");
	        String Color = myObj.nextLine();  // Read Color input*/
	
    		String[] arrOfStr = regNumcolor.split("@", 2);
	        this.veh.setRegNum(arrOfStr[0]);
	        this.veh.setColor(arrOfStr[1]);
	        
	        this.Obj.add(this.veh);
	        //setCurrentSet(this.Obj.size());
   
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
		for(VehicleClass vehObj: this.Obj) {
			System.out.println("Object Found11"+vehObj.getRegNum()+"::"+regNum);
			if(vehObj.getRegNum()==regNum) {
				System.out.println("Object Found");
				Obj.remove(vehObj);
				setCurrentSet(Obj.size());
				return true;
			}
		}
		return false;
		
	}
	
	public List<VehicleClass> getAlldata(){
		return this.Obj;
	}
}
