package playground;

import java.util.Scanner;

public class CodeLoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.nextLine();

        ContactsManager myContactsManager = new ContactsManager();

        myContactsManager.addContact(new Contact("A", phoneNumber));
        myContactsManager.addContact(new Contact("B", "2032991282"));
        myContactsManager.addContact(new Contact("C", "2032991283"));

        Contact searchedContact = myContactsManager.searchContact("A");

        System.out.println("Hey there! You number is " + searchedContact.getPhoneNumber());
    }
}