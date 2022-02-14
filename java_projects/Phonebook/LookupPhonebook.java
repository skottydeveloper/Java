import java.util.*;

public class LookupPhonebook {
	public static void main(String[] args) {
        Phonebook owner = new Phonebook("Sam Johnson");
        owner.addContact(new Contact("Kelly Wong", "(02) 12345678"));
        owner.addContact(new Contact("Richard Jackson", "(02) 87654321"));
        owner.show();

        String searchName = Input.askString("Enter a contact name:");
        Contact result = owner.findContactByName(searchName);

        if (result != null) {
            System.out.println("Phone number is " + result.getPhone());
        } else {
            System.out.println(searchName + " not found");
        }
    }
}