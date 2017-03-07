package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.TollUsage;
import com.example.repository.TollUsageFeignMSRepo;

@RestController
public class TollServiceClient {

	@Autowired
	TollUsageFeignMSRepo tollUsageFeignMSRepo; 
	
	@RequestMapping(value="/client")
	public List<TollUsage> findAll(){
		return tollUsageFeignMSRepo.findAll();
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/client/{id}")
	public TollUsage getById(@PathVariable("id")String id){
		return tollUsageFeignMSRepo.findById(id);
	}
}
