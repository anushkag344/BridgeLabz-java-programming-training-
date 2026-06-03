abstract class User {
    //child classes direct use kar sakti hain.
    protected String name;
    protected int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void issueBook();

    public void showUser() {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
    }
}

class Student extends User {
    public Student(String name, int id) {
        super(name, id);
    }

    @Override
    void issueBook() {
        System.out.println(name + " issued a book as Student");
    }
}

class Faculty extends User {
    public Faculty(String name, int id) {
        super(name, id);
    }
//Ye method parent class wale method ko override kar raha hai
    @Override
    void issueBook() {
        System.out.println(name + " issued a book as Faculty");
    }
}

class Book {
    private String bookName;
    private String author;
    private boolean available;

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
        this.available = true;
    }

    public void issueBook() {
        if (available) {
            available = false;
            System.out.println("Book Issued : " + bookName);
        } else {
            System.out.println("Book not available");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println("Book Returned : " + bookName);
    }

    public void calculateFine(int days) {
        int fine = 0;

        if (days > 7) {
            fine = (days - 7) * 10;
        }

        System.out.println("Fine : " + fine);
    }

    public void showBook() {
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + author);

        if (available) {
            System.out.println("Status : Available");
        } else {
            System.out.println("Status : Issued");
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Anushka", 101);
        Faculty f1 = new Faculty("Rahul", 201);

        Book b1 = new Book("Java Programming", "James Gosling");

        System.out.println("----- STUDENT DETAILS -----");
        s1.showUser();

        System.out.println("\n----- FACULTY DETAILS -----");
        f1.showUser();

        System.out.println("\n----- BOOK DETAILS -----");
        b1.showBook();

        System.out.println("\n----- ISSUE BOOK -----");
        s1.issueBook();
        b1.issueBook();

        System.out.println("\n----- BOOK STATUS -----");
        b1.showBook();

        System.out.println("\n----- RETURN BOOK -----");
        b1.returnBook();

        System.out.println("\n----- FINE CALCULATION -----");
        b1.calculateFine(12);
    }
}