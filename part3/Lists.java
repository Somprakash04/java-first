import java.util.ArrayList;
import java.util.Scanner;
public class Lists {
    public static void main(String[] args){
        // ArrayList initialization
        ArrayList<Integer> list = new ArrayList<>();
        // Adding elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size());
        //System.out.println(list.get(0));
        for(int i=0; i<list.size(); i++){
            int integer = list.get(i);
            System.out.println(integer);
            //alternative:   System.out.println(list.get(i));
        }
        for(Integer integer : list){
            System.out.println(integer);
        }
        // Removing an element
        list.remove(0);
        System.out.println(0);
        // direct number remove--]
        list.remove(Integer.valueOf(3));
        System.out.println("new number");
        for(Integer integer : list){
            System.out.println(integer);
        }

       
// USER DIFINE LIST-----
    

    }
}
