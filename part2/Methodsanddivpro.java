import java.util.Scanner;
// FUNCTIONS--------------------------
 public class Methodsanddivpro {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         // program code
    
//         greet();
//         This_method_says_woof();
//     }
//     // your own methods here
//     public static void greet() {
//         System.out.println("Greetings from the method world!");
//     }
//     public static void This_method_says_woof ( ) {
//         System.out.println("woof");
// //// ABOVE ARE MANY FUNCTIONS CREATE AND USE---------------
//     }
//METHOD PARAMTERS ----------------
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // program code
        
        //greet(5);
        //greet(1);
        greet(1+2);
        printnum(5);


      }
      public static void greet(int numOfTimes) {
        int i = 0;
        while (i < numOfTimes) {
            System.out.println("Greetings!");
            i++;
        }
    }
    public static void printnum(int n) {
        for(int i=0;i<n;i++){
            System.out.println(i);
        }
    }
 }
