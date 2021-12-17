package com.brideglabz.addressbookapp.service;

    import org.springframework.stereotype.Service;

    import com.brideglabz.addressbookapp.model.Contact;
    import com.brideglabz.addressbookapp.dto.ContactDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {
    @Override
    public List<Contact> getContact() {
        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact(1,
                new ContactDTO("Anant  ", "Sinde", "Hadpsar", "Pune", "Maharashtra", "412307", "7620839838")));
        return contactList;
    }

    @Override
    public Contact getContactById(int contactId) {
        Contact contact = new Contact(1,
                new ContactDTO("Aditya", "Shinde", "Latur", "Latur", "Maharashtra", "431123", "99999999"));
        return contact;
    }

    @Override
    public Contact createContact(ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        return contact;
    }

    @Override
    public Contact updateContact(int contactId, ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        return contact;
    }

    @Override
    public void deleteContact(int contactId) {

    }
}

