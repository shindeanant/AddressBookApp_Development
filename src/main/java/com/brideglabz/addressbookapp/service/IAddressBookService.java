package com.brideglabz.addressbookapp.service;
import java.util.List;

import com.brideglabz.addressbookapp.model.Contact;
import com.brideglabz.addressbookapp.dto.ContactDTO;

public interface IAddressBookService {
    List<Contact> getContact();

    Contact getContactById(int contactId);

    Contact createContact(ContactDTO contactDTO);

    Contact updateContact(int contactId, ContactDTO contactDTO);

    void deleteContact(int contactId);
}
