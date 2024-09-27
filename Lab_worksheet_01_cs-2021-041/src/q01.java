import java.util.Scanner;
public class q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String oddLengthWord;
        System.out.println("Enter a word with odd no of letters");
        oddLengthWord =  scanner.next();
        int length = oddLengthWord.length();
        int middle = length/2;
        System.out.println("The middle character is= "+oddLengthWord.charAt(middle));

    }
}