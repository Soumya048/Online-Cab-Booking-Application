package com.masai.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Driver;

@Repository
public interface DriverDao extends JpaRepository<Driver, Integer> {

	public Optional<Driver> findByUserUsername(String name);
	
	public Optional<Driver>findByUserMobile(String mobile);
	
	public List<Driver> findByCabAvailable(String bool);
}