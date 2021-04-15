package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;



@Service
public class ContactServiceImpl implements ContactService{
	
	//fake list of contact
	
	List<Contact> list=List.of(
			
			new Contact(1L, "randhir@gmail.com", "Randhir", 1111L),
			new Contact(2L, "chandra@gmail.com", "Chandra", 1111L),
			new Contact(3L, "rishabh@gmail.com", "Rishabh", 1115L),
			new Contact(4L, "kundan@gamil.com", "Kundan", 1112L)
			);

	@Override
	public List<Contact> getContactsOfUser(Long userId) {


		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

	
	

}
