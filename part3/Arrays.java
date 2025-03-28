import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        // Creating an array
        
        int[] numbers = new int[4];
        numbers[0] = 1;
        numbers[1] = 2; 
        numbers[2] = 3;
        // no this---numbers[3] = 4;
        // Printing the array
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter a number to add to the array: ");
        //int newNumber= scanner.nextInt();
        //int newNumber = Integer.valueOf(scanner.nextInt());
        //newNumber = numbers[newNumber];
        // take size from user----
        
        // create new array
        System.out.println("Enter a newarray size:");
        int size = Integer.valueOf(scanner.nextInt());
        int[] newarray = new int[size];
        System.out.println("Enter a numbers:");
        // add new number to new array
         for(int i=0; i<newarray.length; i++){
            newarray[i] = scanner.nextInt();
        }
        System.out.println("display:");
        for(int i =0; i<newarray.length; i++){
            System.out.println(newarray[i]);
        }// sum
        int sumOfNumbersInArray =0;
        for(int i=0; i<newarray.length; i++){
            sumOfNumbersInArray += newarray[i];
        }
        System.out.println("sumOfNumbersInArray:"+sumOfNumbersInArray);
        for(int j=newarray[];i<newarray[i]; j++){
            int 
        }
}
}
