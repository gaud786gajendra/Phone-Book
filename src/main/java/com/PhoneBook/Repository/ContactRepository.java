package com.PhoneBook.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PhoneBook.Model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
