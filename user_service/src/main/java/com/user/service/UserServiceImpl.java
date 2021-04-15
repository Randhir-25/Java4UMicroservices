package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	List<User> list=List.of(
			new User(1111L, "Randhir Kumar", "997837887"),
			new User(1112L, "Kundan Kumar", "798968989"),
			new User(1115L, "Rishabh Kumar", "889898090")
			
			);

	@Override
	public User getUser(Long id) {
		
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}
	
}
