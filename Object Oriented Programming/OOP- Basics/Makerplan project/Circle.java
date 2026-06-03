class Circle {

    double radius;

    Circle(double radius) {

        this.radius = radius;
    }

    void area() {

        double area = 3.14 * radius * radius;

        System.out.println("Area: " + area);
    }

    void circumference() {

        double c = 2 * 3.14 * radius;

        System.out.println("Circumference: " + c);
    }
}

class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle(5);

        c1.area();

        c1.circumference();
    }
}