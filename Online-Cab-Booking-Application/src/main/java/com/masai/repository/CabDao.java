package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Cab;

@Repository
public interface CabDao extends JpaRepository<Cab, Integer>{


	public List<Cab> findAllBycabTpye(String cabType);
		
	
}
