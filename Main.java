package com.arrays;

import java.util.Scanner;

public class Main {
	// Challenge
	// Create a program that implements a simple mobile phone with the following
	// capabilities.
	// Able to store, modify, remove and query contact names.
	// You will want to create a separate class for Contacts (name and phone
	// number).
	// Create a master class (MobilePhone) that holds the ArrayList of Contacts
	// The MobilePhone class has the functionality listed above.
	// Add a menu of options that are available.
	// Options: Quit, print list of contacts, add new contact, update existing
	// contact, remove contact
	// and search/find contact.
	// When adding or updating be sure to check if the contact already exists (use
	// name)
	// Be sure not to expose the inner workings of the Arraylist to MobilePhone
	// e.g. no ints, no .get(i) etc
	// MobilePhone should do everything with Contact objects only.
	private static Scanner scanner = new Scanner(System.in);
	static MobilePhone mobile = new MobilePhone();

	public static void addNewContact() {
		if (scanner.hasNextLine()) {
			scanner.nextLine(); // This will consume any leftover newline character
		}
		System.out.print("Enter Contact Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Contact Number: ");
		String number = scanner.nextLine();

		mobile.storeContact(name, number);
	}

	public static void removeContact() {
		if (scanner.hasNextLine()) {
			scanner.nextLine(); // This will consume any leftover newline character
		}
		System.out.println("Enter Contact Name to be deleted: ");
		String name = scanner.nextLine();

		mobile.removeContact(name);
	}

	public static void searchContact() {
		if (scanner.hasNextLine()) {
			scanner.nextLine(); // This will consume any leftover newline character
		}
		System.out.println("Enter Contact Name: ");
		String name = scanner.nextLine();

		Contacts contact = mobile.searchContact(name);
		if (contact == null) {
			System.out.println("Contact Not Found");
		} else {
			mobile.printContact(contact);
		}

	}

	public static void modifyContact() {
		if (scanner.hasNextLine()) {
			scanner.nextLine(); // This will consume any leftover newline character
		}
		System.out.println("Enter Contact Name to be Modified: ");
		String name = scanner.nextLine();
		System.out.println("What do you want to modify:\r option 1 Name \r option 2 Number \r option 3 Both ");

		int option = scanner.nextInt();
		if (scanner.hasNextLine()) {
			scanner.nextLine(); // This will consume any leftover newline character
		}
		switch (option) {
			case 1:
				System.out.println("Enter New Name: ");
				String newName = scanner.nextLine();
				mobile.modifyContact(name, newName, null);
				break;

			case 2:
				System.out.println("Enter New Number: ");
				String newNumber = scanner.nextLine();
				mobile.modifyContact(name, null, newNumber);
				break;

			case 3:

				System.out.println("Enter New Name: ");
				newName = scanner.nextLine();

				System.out.println("Enter New Number: ");
				newNumber = scanner.nextLine();

				mobile.modifyContact(name, newName, newNumber);
				break;
		}

	}

	public static void main(String[] args) {
		System.out.println("Option 1: Print contact List");
		System.out.println("Option 2: Add new contact");
		System.out.println("Option 3: Remove contact");
		System.out.println("Option 4: Search contact ");
		System.out.println("Option 5: Modify Existing contact ");
		System.out.println("Option 6: Quit");
		while (true) {
			System.out.println("What do you want to do");
			int option = scanner.nextInt();

			switch (option) {
				case 1:
					mobile.printContactList();
					break;

				case 2:
					addNewContact();
					break;
				case 3:
					removeContact();
					break;
				case 4:
					searchContact();
					break;

				case 5:
					modifyContact();
					break;

				case 6:
					System.out.println("Quit");
					break;
				case 7:
					int found = mobile.findContact(new Contacts("ngozi", "1234"));
					System.out.println("Found contact " + found);

			}
		}

	}

}
