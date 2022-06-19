package com.PhoneBook.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PhoneBook.Model.Contact;
import com.PhoneBook.Repository.ContactRepository;

@Service
public class ContactServiceImp implements ContactService{

	@Autowired
	private ContactRepository contactRepository;
	
	
	@Override
	public boolean saveContact(Contact contact) {
		// TODO Auto-generated method stub IllegalArgumentException
		
		Contact save = contactRepository.save(contact);
		if(save !=null)
		{
			return true;
		}
		return false;
	}

}
