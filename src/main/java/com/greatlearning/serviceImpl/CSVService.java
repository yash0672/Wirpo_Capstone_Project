package com.greatlearning.serviceImpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.greatlearning.entity.ProductInfo;
import com.greatlearning.helper.CSVHelper;
import com.greatlearning.repository.ProductInfoRepository;
import com.greatlearning.repository.ProductRepository;

@Service
public class CSVService {
	
	@Autowired
	ProductInfoRepository repository;
	public void save(MultipartFile file) {
		try {
			List<ProductInfo> tutorials = CSVHelper.csvToTutorials(file.getInputStream());
			repository.saveAll(tutorials);
		} catch (IOException e) {
			throw new RuntimeException("fail to store"+e.getMessage());
		}
	}
	public List<ProductInfo> getAllTutorials(){
		return repository.findAll();
	}
	
	

}
