import java.util.*;

class Employee {
    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class EmployeeRecord {
    public static void main(String[] args) {

        HashMap<Integer, Employee> map = new HashMap<>();

        map.put(101, new Employee(101, "Anushka", "IT"));
        map.put(102, new Employee(102, "Muskan", "HR"));
        map.put(103, new Employee(103, "Riya", "Finance"));

        int searchId = 102;

        if (map.containsKey(searchId)) {
            System.out.println("Employee Found:");
            map.get(searchId).display();
        } else {
            System.out.println("Employee not found");
        }
    }
}