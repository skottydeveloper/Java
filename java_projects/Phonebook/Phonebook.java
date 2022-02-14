import java.util.*;

public class Phonebook {
    private String owner;
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public Phonebook(String owner) {
        this.owner = owner;
    }

    public void show() {
        System.out.println(owner + "'s phonebook");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public Contact findContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }
}