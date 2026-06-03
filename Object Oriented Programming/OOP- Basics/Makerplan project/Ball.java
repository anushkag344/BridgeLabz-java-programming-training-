class Ball {

    String color;
    int size;

    Ball(String color, int size) {

        this.color = color;
        this.size = size;
    }

    void displayBall() {

        System.out.println("Ball Color: " + color);
        System.out.println("Ball Size: " + size);
    }
}

class Bag {

    String bagName;
    Ball ball;

    Bag(String bagName, Ball ball) {

        this.bagName = bagName;
        this.ball = ball;
    }

    void displayBag() {

        System.out.println("Bag Name: " + bagName);

        System.out.println("Bag Contains:");

        ball.displayBall();
    }
}

 class Main {

    public static void main(String[] args) {

        Ball b1 = new Ball("Red", 5);

        Bag bag1 = new Bag("School Bag", b1);

        bag1.displayBag();
    }
}