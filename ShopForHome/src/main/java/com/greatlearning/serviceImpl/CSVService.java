package com.greatlearning.serviceImpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import com.greatlearning.entity.product;
import com.greatlearning.helper.CSVHelper;
import com.greatlearning.repository.ProductRepository;

@Service
public class CSVService {
	
	@Autowired
	ProductRepository repository;
	public void save(MultipartFile file) {
		try {
			List<product> tutorials = CSVHelper.csvToTutorials(file.getInputStream());
			repository.saveAll(tutorials);
		} catch (IOException e) {
			throw new RuntimeException("fail to store"+e.getMessage());
		}
	}
	public List<product> getAllTutorials(){
		return repository.findAll();
	}
	
	

}
