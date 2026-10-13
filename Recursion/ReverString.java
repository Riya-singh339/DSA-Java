import java.util.*;
public class ReverString {
    static void reverse(String s, int i){
        if(i == s.length()) return;
        reverse(s, i+1);
        System.out.print(s.charAt(i));
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        reverse(s, 0);
    }
}