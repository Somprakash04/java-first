import java.util.Scanner;
public class Calculating {
    public static void main(String[] args){
        // int first=4;
        // int second=5;
        // int sum = first + second;
        // int sub = first-second;
        // int mul = first*second;
        // int div = first/second;
        // System.err.println("sum = " + sum);
        // System.err.println("sub = " + sub);
        // System.err.println("mul = " + mul);
        // System.err.println("div = " + div);

// USER INPUT-------------------------------
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int first = scanner.nextInt();
        System.out.println("Enter second number:");
        int second = scanner.nextInt();
        int sum = first + second;
        int sub = first-second;
        int mul = first*second; 
        int div = first/second;
        System.err.println("sum = " + sum);
        System.err.println("sub = " + sub);
        System.err.println("mul = " + mul);
        System.err.println("div = " + div);

        // int first = 2;
        // int second = 4;
        // System.out.println(first + second); // prints 6
        // System.out.println(2 + second - first - second); // prints 0
    }
}
