public class ConditionalSt {
    public static void main(String[] args){
        System.out.println("hello");
        if(true){
            System.out.println("true");//true
        }
        int number = 11;
        if(number>10){
            number = 9;
            System.out.println("number: "+number);            
        }// similar to else statement
        // Comparison Operators
        // > greater than
        // >= greater than or equal to
        // < less than
        // <= less than or equal to
        // == equal to
        // != not equal to 
        int remainder = 7 % 2;
        System.out.println(5 % 3); // prints 2
        System.out.println(remainder); // prints 1
        System.out.println(7 % 4); // prints 3
        System.out.println(8 % 4); // prints 0
        System.out.println(1 % 2); // prints 1  
        
        // Logical Operators-----------
        // AND (&&), OR (||), NOT(!)    
    }
}
