import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word;
        int index;

            System.out.println("Enter a Word: ");
            word = scanner.next();

            System.out.println("Enter a character number index: ");
            index = scanner.nextInt();

            while(index > word.length()){
                System.out.println("Your word \"" + word + "\" is " + word.length() + " characters long.");
                System.out.println("The index you selected is too large. Please enter a smaller index: ");
                index = scanner.nextInt();
            }

        if(index < word.length()){
            System.out.println("Your word \"" + word + "\" is " + word.length() + " characters long.");
            System.out.println("The Substring of \"" + word + "\" from 0 to index " + index + " is \"" + word.substring(0, index) + "\"");
        }

    }
}
