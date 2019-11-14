package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Associate;

public interface AssociateRepository extends JpaRepository<Associate, Integer> {

public List<Associate> findAllByOrderByLastNameAsc();
	
	// search by name
	public List<Associate> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String name, String lName);
}
