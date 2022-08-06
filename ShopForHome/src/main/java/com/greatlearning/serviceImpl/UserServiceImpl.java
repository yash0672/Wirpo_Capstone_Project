package com.greatlearning.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.entity.user;
import com.greatlearning.repository.UserRepository;
import com.greatlearning.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;

	@Override
	public void save(user u) {
		// TODO Auto-generated method stub
		userRepository.save(u);
		
	}

	@Override
	public List<user> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
		
	}

	@Override
	public Optional<user> findByUserId(Long Id) {
		// TODO Auto-generated method stub
		
		return userRepository.findById(Id);
	}

	@Override
	@Transactional
	public void update(user u) {
		// TODO Auto-generated method stub
		user oldUser=getUserRec(u.getId());
		oldUser.setAddress(u.getAddress());
		oldUser.setEmail(u.getEmail());
		oldUser.setName(u.getName());
		oldUser.setPhNumber(u.getPhNumber());
		oldUser.setRole(u.getRole());
		
		
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		userRepository.deleteAll();
	}

	@Override
	public void deleteById(long Id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(Id);
		
	}
	
	
	
	private user getUserRec(long id) {
        Optional<user> userObj = userRepository.findById(id);

        if (userObj.isPresent()) {
            return userObj.get();
        }
        return null;
    }
	

}
