package com.PhoneBook.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PhoneBook.Model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
