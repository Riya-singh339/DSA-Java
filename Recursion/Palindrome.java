import java.util.*;
public class Palindrome {
    static String palin(String s,int i,int l){
        if(i >= l) return "Palindrome";
        if (s.charAt(i) != s.charAt(l)) return "Not palindrome";
        return palin(s,i+1,l-1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println(palin(s,0,s.length()-1));
    }
}
