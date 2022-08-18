package com.phonebookapplicationRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phonebookapplicationModel.ContactDetails;

public interface Phonerepository extends JpaRepository<ContactDetails, Integer>{

}
