package com.greatlearning.serviceImpl;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.greatlearning.entity.product;
import com.greatlearning.entity.user;
import com.greatlearning.repository.ProductRepository;
import com.greatlearning.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepository productRepository;

	@Override
	public void save(product p) {
		// TODO Auto-generated method stub
		productRepository.save(p);
	}

	@Override
	public List<product> findAll() {
		// TODO Auto-generated method stub
		
		return productRepository.findAll();
	}

	@Override
	public Optional<product> findById(Long Id) {
		// TODO Auto-generated method stub
		return productRepository.findById(Id);
	}

	@Override
	public List<product> findByCategory(String category) {
		// TODO Auto-generated method stub
		product p=new product();
		p.setCategory(category);
		ExampleMatcher matcher=ExampleMatcher.matchingAll().withMatcher("Category", ExampleMatcher.GenericPropertyMatchers.exact()).
				withIgnorePaths("id","firstname");
		Example<product> example=Example.of(p,matcher);
		List<product> pro=productRepository.findAll(example);
		return pro;
	}

	@Override
	public void update(product p) {
		// TODO Auto-generated method stub
		product prod=getProductRec(p.getId());
		prod.setCategory(p.getCategory());
		prod.setDescription(p.getDescription());
		prod.setName(p.getName());
		prod.setIconLink(p.getIconLink());
		prod.setPrice(p.getPrice());
		prod.setStatus(p.getStatus());
		prod.setStock(p.getStock());
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		productRepository.deleteAll();
		
	}

	@Override
	public void deleteById(Long Id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(Id);
		
	}
	
	private product getProductRec(long id) {
        Optional<product> productObj = productRepository.findById(id);

        if (productObj.isPresent()) {
            return productObj.get();
        }
        return null;
    }

}
