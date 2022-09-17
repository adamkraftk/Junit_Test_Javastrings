import java.util.Scanner;

public class JavaString {
    public static void main(String[] args){
        //Get string from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a String of text here: ");
        String newString = scanner.nextLine();

        // Create instances of the java.lang methods.
        int stringLength = newString.length();
        char firstLetter = newString.charAt(0);
        String firstThreeLetters = newString.substring(0,3);
        int secondLetter = newString.indexOf("a");

        System.out.print("\nThe length of the String is: " + stringLength + "\nThe first letter in the String is: " + firstLetter + "\nThe first three letters in the String: " + firstThreeLetters + "\nCheck to see where 'a' is if answer is -1 then 'a' isn't there: " + secondLetter);
    }

}
