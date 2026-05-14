class Line {

    int x1, y1, x2, y2;

    Line(int x1, int y1, int x2, int y2) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    double length() {

        return Math.sqrt(
                (x2 - x1) * (x2 - x1) +
                (y2 - y1) * (y2 - y1)
        );
    }
}
 class Main {

    public static void main(String[] args) {

        Line l1 = new Line(1, 2, 4, 6);

        Line l2 = new Line(2, 3, 5, 7);

        double len1 = l1.length();

        double len2 = l2.length();

        System.out.println("Line 1 Length: " + len1);

        System.out.println("Line 2 Length: " + len2);

        if(len1 > len2) {

            System.out.println("Line 1 is greater");
        }
        else if(len1 < len2) {

            System.out.println("Line 2 is greater");
        }
        else {

            System.out.println("Both lines are equal");
        }
    }
}