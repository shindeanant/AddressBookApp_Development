package com.brideglabz.addressbookapp.controller;

import com.brideglabz.addressbookapp.model.Contact;
import com.brideglabz.addressbookapp.dto.ContactDTO;
import com.brideglabz.addressbookapp.dto.ResponseDTO;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
    @RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getContactData() {

        Contact contact = new Contact(1,
                new ContactDTO("Anant  ", "Sinde", "Hadpsar", "Pune", "Maharashtra", "412307", "7620839838"));
        ResponseDTO response = new ResponseDTO("Get call success", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }

    /**
     * Purpose : Ability to fetch all contact details in AddressBook
     */
    @GetMapping("/getContactDetails")
    public ResponseEntity<ResponseDTO> getContactData(@PathVariable("contactId") int contactId) {
        Contact contact = new Contact(1,
                new ContactDTO("Aditya", "Shinde", "Latur", "Latur", "Maharashtra", "431123", "99999999"));
        ResponseDTO response = new ResponseDTO("Get call success for id", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    /**
     * Purpose : Ability to add contact details in AddressBook
     */

    @PostMapping("/addContactDetails")
    public ResponseEntity<ResponseDTO> addContactData(@RequestBody ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        ResponseDTO response = new ResponseDTO("Created contact data for", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    /**
     * Purpose : Ability to update contact details in AddressBook
     */
    @PutMapping("/updateContactDetails")
    public ResponseEntity<ResponseDTO> updateContactData(@PathVariable("contactId") int contactId,
            @RequestBody ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        ResponseDTO response = new ResponseDTO("Updated contact data for", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    /**
     * Purpose : Ability to delete contact details in AddressBook
     */
    @DeleteMapping("/deleteContactDetails")
    public ResponseEntity<ResponseDTO> deleteContactData(@PathVariable("contactId") int contactId) {
        ResponseDTO response = new ResponseDTO("Delete call success for id ", "deleted id:" + contactId);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }
}

