package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Laptop1;
import com.example.demo.repository.Laptop1Repository;

import com.example.demo.service.Laptop1Service;

@Service
public class Laptop1ServiceImpl implements Laptop1Service{
	@Autowired
	Laptop1Repository laptop1Repository;
	
	public List<Laptop1> getLaptop(){
		return laptop1Repository.findAll();
	}

	public Laptop1 getLaptop1ById(Integer id) {
		Optional<Laptop1> laptop1=laptop1Repository.findById(id);
		return laptop1.orElse(null);
	}

	public Laptop1 getlaptop1ByName(String name) {
		Laptop1 laptop1=laptop1Repository.findbyName(name);
		return laptop1;
	}
	public Laptop1 postLaptop1(Laptop1 laptop1) {
		Laptop1 s= laptop1Repository.save(laptop1);
		return s;
	}


	public String deleteLaptop1ById(Integer id) {
		laptop1Repository.deleteById(id);
		return "Delete Success";
	}
	public String updateLaptop1ById(Integer id, Laptop1 updatingLaptop1) {
		//get the record from DB
		Optional<Laptop1> existingLaptop1 = laptop1Repository.findById(id);
		if(existingLaptop1.isPresent()) {
		//modify in app layer
			Laptop1 laptop1 = existingLaptop1.get();
		laptop1.setName(updatingLaptop1.getName());
		//save the updated record
		laptop1Repository.save(laptop1);
		return "Update success";
		}else {
			return "record not found";
		}
		
	}

	
}
