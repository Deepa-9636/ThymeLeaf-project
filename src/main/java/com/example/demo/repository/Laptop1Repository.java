package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Laptop1;

@Repository
public interface Laptop1Repository extends JpaRepository<Laptop1, Integer>{

	@Query("SELECT s FROM Laptop1 s WHERE s.name= :name")
	Laptop1 findbyName(String name);

	
}
