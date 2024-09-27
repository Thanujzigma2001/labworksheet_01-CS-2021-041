import java.util.Scanner;
public class q02{
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your full name in the form of first middle last");
        String fullName = scanner.nextLine();
        String[] nameParts =fullName.split(" ");
        System.out.println("The name in last,first middle-initial mode==>"+nameParts[2]+","+nameParts[0]+" "+nameParts[1].charAt(0));
    
    }
}