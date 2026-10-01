import java.util.Scanner;

class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distanceTo(Point other) {
        double dx = other.x - this.x;
        double dy = other.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class APEXDay29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x and y of first point: ");
        Point p1 = new Point(sc.nextDouble(), sc.nextDouble());

        System.out.print("Enter x and y of second point: ");
        Point p2 = new Point(sc.nextDouble(), sc.nextDouble());

        double d = p1.distanceTo(p2);

        // print 5 instead of 5.0 when the result is a whole number
        if (d == (long) d) {
            System.out.println((long) d);
        } else {
            System.out.println(d);
        }

        sc.close();
    }
}