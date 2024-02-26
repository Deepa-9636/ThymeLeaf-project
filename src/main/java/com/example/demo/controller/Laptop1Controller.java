package com.example.demo.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Laptop1;
import com.example.demo.serviceimpl.Laptop1ServiceImpl;

@Controller
public class Laptop1Controller {
	@Autowired
	Laptop1ServiceImpl laptop1Service;

	
	@GetMapping(value="/laptops")
	public String getLaptop(Model model){
		model.addAttribute("laptop1", laptop1Service.getLaptop());
		return "viewlaptop1";	
	}
	
	
	@GetMapping(value="/laptops/{id}")
	public Laptop1 getLaptop1ById(@PathVariable Integer id) {
		return laptop1Service.getLaptop1ById(id);
	}
	
	//get students by name
	@GetMapping(value="/getbyname/{name}")
	public Laptop1 getLaptop1ByName(@PathVariable String name) {
		return laptop1Service.getlaptop1ByName(name);
	}
	//insert a student into dB
	@PostMapping(value="/post")
	public Laptop1 postLaptop1(@RequestBody Laptop1 laptop1) {
		return laptop1Service.postLaptop1(laptop1);
	}
	//delete student by id
	@DeleteMapping(value="/delete/{id}")
	public String deleteLaptop1ById(@PathVariable Integer id) {
		return laptop1Service.deleteLaptop1ById(id);
	}
	//update student by id -put
		@PutMapping(value="/put/{id}")
		public String updatLaptop1ById(@PathVariable Integer id,@RequestBody Laptop1 laptop1) {
			return laptop1Service.updateLaptop1ById(id,laptop1);
		}
	
}
