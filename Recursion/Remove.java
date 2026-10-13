import java.util.*;
public class Remove {
    static String remove(String s, int i){
        if(i == s.length()){
            return " ";
        }
        String ans = remove(s, i+1);
        char currchar =s.charAt(i);
        if(currchar != 'a'){
            return currchar + ans;
        }else{
            return ans;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
    }
}
