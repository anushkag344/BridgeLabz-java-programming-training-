class Student {

    int id;
    String name;

    void display() {
        System.out.println(id);
        System.out.println(name);
    }
}

 class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.id = 101;
        s1.name = "Anushka";

        s1.display();
    }
}