package playground;

public class ContactsManager {
    Contact[] contacts = new Contact[10];
    int index = 0;

    public void addContact(Contact contact) {
        this.contacts[index++] = contact;
    }

    public Contact searchContact(String name) {
        if (name != null) {
            for(Contact contact:this.contacts) {
                if (name.equals(contact.getName())) {
                    return contact;
                }
            }

        }

        return null;
    }
}

class Contact {
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}