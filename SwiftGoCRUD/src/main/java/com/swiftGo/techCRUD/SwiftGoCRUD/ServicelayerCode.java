package com.swiftGo.techCRUD.SwiftGoCRUD;

import java.util.List;

import org.springframework.stereotype.Service;

import com.swiftGo.techCRUD.SwiftGoCRUD.Database.NewSwift;

@Service
public class ServicelayerCode {
	
	private final NewSwiftInterface newSwi;

	public ServicelayerCode(NewSwiftInterface newSwi) {
		// TODO Auto-generated constructor stub
		this.newSwi = newSwi;
	}

	public List<NewSwift> load() {
		
		return newSwi.findAll();
		
	}
	
	public void users() {
	}
	
	public void usersbytPut(NewSwift nS) {
		newSwi.insert(nS);
	}
	
	
}
