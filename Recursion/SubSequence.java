import java.util.*;

public class SubSequence {
    static void printSSQ(String s,String currans){
        if(s.length() == 0){
            System.out.println(currans);
            return;
        }
        char curr = s.charAt(0);
        String rem = s.substring(1);      
        printSSQ(rem, curr + currans);
        printSSQ(rem, currans);

    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        printSSQ(s," ");
    }
}
