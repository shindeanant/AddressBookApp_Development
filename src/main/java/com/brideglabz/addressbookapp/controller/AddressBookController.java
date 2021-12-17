package com.brideglabz.addressbookapp.controller;

import com.brideglabz.addressbookapp.model.Contact;

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
    public String welcomeUser() {
        return "Welcome to address book home";
    }
    /**
     * Purpose : Ability to fetch all contact details in AddressBook
     */
    @GetMapping("/getContactDetails")
    public String welcomeSpecificUser(@PathVariable String id) {
        return "Welcome, User " + id;
    }
    /**
     * Purpose : Ability to add contact details in AddressBook
     */

    @PostMapping("/addContactDetails")
    public String createContact(@RequestBody Contact contact) {
        return "Added " + contact.getName() + " to list";
    }
      /**
     * Purpose : Ability to update contact details in AddressBook
     */
    @PutMapping("/updateContactDetails")
    public String updateContact(@RequestBody Contact contact) {
        return "Updated " + contact.getName() + " in list";
    }
     /**
     * Purpose : Ability to delete contact details in AddressBook
     */
    @DeleteMapping("/deleteContactDetails")
    public String deleteContact(@PathVariable String id) {
        return "Deleted contact " + id;
    }
}

