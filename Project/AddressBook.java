import java.io.*;
import java.util.*;

class ContactNotFoundException extends Exception {
    ContactNotFoundException(String message) {
        super(message);
    }
}
class Contact implements Serializable {
    // private static final long serialVersionUID = 1L;
    int id;
    String name;
    String phone;

    Contact(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("----------------");
    }
}
public class AddressBook {

    static String fileName = "contacts.dat";
    // Read contacts from file
     @SuppressWarnings("unchecked") 
    static ArrayList<Contact> readContacts() {
        File file = new File(fileName);

        if (!file.exists()) {
            return new ArrayList<Contact>();
        }

        try {
            ObjectInputStream ois =new ObjectInputStream(new FileInputStream(fileName));
            ArrayList<Contact> list =(ArrayList<Contact>) ois.readObject();
            ois.close();
            return list;
        } catch (Exception e) {
            return new ArrayList<Contact>();
        }
    }

    // Save contacts into file
    static void saveContacts(ArrayList<Contact> list) {
        try {
            ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(list);
            oos.close();

        } catch (IOException e) {
            System.out.println("Error Saving File");
        }
    }
    // Add Contact
    static void addContact(int id, String name, String phone) {
        ArrayList<Contact> list = readContacts();
        Contact c = new Contact(id, name, phone);
        list.add(c);
        saveContacts(list);
        System.out.println("Contact Added");
    }
    static void displayContacts() {
        ArrayList<Contact> list = readContacts();

        if (list.isEmpty()) {
            System.out.println("No Contacts Found");
        } else {
            for (Contact c : list) {
                c.display();
            }
        }
    }
    static Contact searchContact(int id) throws ContactNotFoundException {
        ArrayList<Contact> list = readContacts();
        for (Contact c : list) {
            if (c.id == id) {
                return c;
            }
        }
        throw new ContactNotFoundException("Contact Not Found");
    }

    public static void main(String[] args) {

        addContact(101, "Anushka", "9999999999");
        addContact(102, "Muskan", "8888888888");

        System.out.println("\nAll Contacts:");
        displayContacts();

        try {
            System.out.println("\nSearch Contact:");

            Contact c = searchContact(101);

            c.display();

        } catch (ContactNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}