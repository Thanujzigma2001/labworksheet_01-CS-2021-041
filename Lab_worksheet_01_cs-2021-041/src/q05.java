import java.util.Scanner;
public class q05{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter outer radius");
        double ro  = scanner.nextDouble();
        System.out.println("enter inner radius");
        double ri  = scanner.nextDouble();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double innerArea = innerCircle.computeArea();
        double outerArea = outerCircle.computeArea();

        double circularRegionArea = outerArea - innerArea;
        System.out.println("The area of the shaded region of circle ="+circularRegionArea);

    }
}

class Circle {
    private double radius;

    // Constructor to set the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to set the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to compute the area of the circle
    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to compute the circumference of the circle
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}