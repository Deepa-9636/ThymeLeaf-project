package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Laptop1;

@Service
public interface Laptop1Service {
	public List<Laptop1> getLaptop();
	public Laptop1 getLaptop1ById(Integer id);
	public Laptop1 getlaptop1ByName(String name);
	public String deleteLaptop1ById(Integer id);
	

}
