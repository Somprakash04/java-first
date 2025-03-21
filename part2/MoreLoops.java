import java.util.Scanner;

public class MoreLoops {
    public static void main(String[] args) {
        // Loop through the numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
        }
        Scanner scanner = new Scanner(System.in);

System.out.print("Write numbers, negative numbers are invalid: ");
int sum = 0;
int validNumbers = 0;
int invalidNumbers = 0;

while (true) {
    int input = Integer.valueOf(scanner.nextLine());

    if (input == 0) {
        System.out.println("Sum of valid numbers: " + sum);
        System.out.println("Valid numbers: " + validNumbers);
        System.out.println("Invalid numbers: " + invalidNumbers);
        break;
    }

    if (input < 0) {
        invalidNumbers++;
        continue;
    }

    sum += input;
    validNumbers++;
 }
    }
}
