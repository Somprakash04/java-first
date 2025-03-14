import java.util.Scanner;
public class ReadingIp{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a message1: ");
    String message1 = scanner.nextLine();
    System.out.print("Enter a message2: ");
    String message2 = scanner.nextLine();
    System.out.print("Enter a message3: ");
    String message3 = scanner.nextLine();
    System.out.print("Enter a message4: ");
    String message4 = scanner.nextLine();
    System.out.println("Your message:");
    System.out.println(message1);
    System.out.println(message2);
    System.out.println(message3);
    System.out.println(message4);

    }
}
