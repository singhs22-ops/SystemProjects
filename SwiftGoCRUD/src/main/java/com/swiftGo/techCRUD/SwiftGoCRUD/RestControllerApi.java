package com.swiftGo.techCRUD.SwiftGoCRUD;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import com.swiftGo.techCRUD.SwiftGoCRUD.Database.NewSwift;



@CrossOrigin(origins="http://localhost:4200")
@RestController()
public class RestControllerApi {

	public RestControllerApi() {
		// TODO Auto-generated constructor stub
		int i=0;
		System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+ i++);
	}
	
	@Autowired
	public NewSwiftInterface NewS;
	

	@GetMapping(value = "/findAll")
	public List<NewSwift> findAll(){
		return NewS.findAll();
	}
	
	@GetMapping(value ="/welcome")
    public String welcome() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }

	@GetMapping("/load")
	public void load() {
		
	}

	@DeleteMapping("/usersDelete/{id}")
	public String users(@PathVariable Integer id) {
		
		NewS.deleteById(id);
			return "Deleted";
	}
	
	@DeleteMapping("/users/{id}")
	public Optional<NewSwift> usersbyId(@PathVariable Integer id) {
		return NewS.findById(id);
	}
	
	@PutMapping("/usersbyput")
	public boolean  usersbytPut(@RequestBody NewSwift nS) {
		
			 if(NewS.insert(nS) != null) {
				 return true;
			 }
			 return false;
	}
}
