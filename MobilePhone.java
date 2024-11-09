package com.arrays;

import java.util.ArrayList;

public class MobilePhone {

	private ArrayList<Contacts> contactList = new ArrayList<Contacts>();

	// Store contact
	public void storeContact(String name, String number) {
		Contacts contact = searchContact(name);
		if (contact == null) {
			contactList.add(new Contacts(name, number));
		} else {
			System.out.println("This name is already in your contact list");

		}

	}

	public void printContactList() {
		for (int i = 0; i < contactList.size(); i++) {
			printContact(contactList.get(i));
			System.out.println();
		}
	}

	// Modify contact
	public void modifyContact(String nameToUpdate, String contactName, String contactNumber) {
		Contacts contact = searchContact(nameToUpdate);
		if (contact == null) {
			System.out.println("Contact Not found");
		} else {
			if (contactName != null) {
				contact.setName(contactName);
			}
			if (contactNumber != null) {
				contact.setNumber(contactNumber);
			}
			System.out.println("Contact modified");
			printContact(contact);
		}

	}

	public int findContact(Contacts contact) {
		return contactList.indexOf(contact);
	}

	// remove contact

	public void removeContact(String name) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
				contactList.remove(i);
				// break;
				System.out.println("Contact Removed");
				return;
			}

		}
		System.out.println("Contact Not found");
		return;

	}

	// search contact
	public Contacts searchContact(String name) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
				// printContact(contactList.get(i));
				return contactList.get(i);
			}

		}
		return null;
	}

	public void printContact(Contacts contact) {
		System.out.println("Contact name: " + contact.getName());
		System.out.println("Contact number: " + contact.getNumber());
	}

}
