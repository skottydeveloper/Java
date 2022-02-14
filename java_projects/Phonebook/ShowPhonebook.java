import java.util.*;

public class ShowPhonebook {
	public static void main(String[] args) {
        Phonebook owner = new Phonebook("Sam Johnson");
        owner.addContact(new Contact("Kelly Wong", "(02) 12345678"));
        owner.addContact(new Contact("Richard Jackson", "(02) 87654321"));
        owner.show();
    }
}