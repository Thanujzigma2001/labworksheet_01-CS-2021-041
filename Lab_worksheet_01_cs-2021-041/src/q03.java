import java.util.Scanner;
public class q03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length in cm");
        double lengthIncm = scanner.nextDouble();
        double lengthinInches = lengthIncm/2.54;
        int lengthInFeet  = (int)lengthinInches/12;
        int lengthinRInches = (int)lengthinInches%12;
        System.out.println("The length in feets and inches ="+lengthInFeet+"feet "+lengthinRInches+"inches");

    }
}