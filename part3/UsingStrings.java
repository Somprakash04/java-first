import java.util.Scanner;

public class UsingStrings {
    public static void main(String[] args){
        // String str1 = "Hello";
        // String str2 = "World";
        // System.out.println(str1 + " " + str2);
        // System.out.println("Using strings:"+ str1 + str2);
        // //Reading and printing
         Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter a string:");
        // String userInput = scanner.nextLine();
        // System.out.println("userInput String is:"+ userInput);
        // String text = "course";
        // String anotherText = "horse";
        
        // if (text.equals(anotherText)) {
        //     System.out.println("The two texts are equal!");
        // } else {
        //     System.out.println("The two texts are not equal!");
        // }
        //Splitting a String---------
        //String text = "hii my name sp";
        //System.out.println("split:"+ split);
        // String text = "first second third fourth";
        // String[] pieces = text.split("");
        // System.out.println(pieces[0]);
        // System.out.println(pieces[1]);
        // System.out.println(pieces[2]);
        // System.out.println(pieces[3]);

        // System.out.println();

        // for (int i = 0; i < pieces.length; i++) {
        //     System.out.println(pieces[i]);
        // }

//         String text = "Hello world!";
//         char character = text.charAt(6);
//         System.out.println(character);

//         //BADIYA CONCEPT BUT COMPLEX------
// int sum = 0;

// while (true) {
//     String input = scanner.nextLine();
//     if (input.equals("")) {
//         break;
//     }

//     String[] parts = input.split(" ");
//     sum = sum + Integer.valueOf(parts[1]);
// }

//System.out.println("Sum of the ages is " + sum);
        //liength--
        String word = "equisterian";
        int length = word.length();
        System.out.println("The length of the word" + word + " is " + length);
        System.out.println("length is " + word.length());
    }
}
