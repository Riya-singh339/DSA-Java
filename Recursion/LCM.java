import java.util.*;

public class LCM {
    static int gcd (int x,int y){
        if(y == 0){
            return x;
        }
        return gcd(y,x%y);
    }
    public static void main(Remove[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        int x=sc.nextInt();
        System.out.println("Enter the 2nd input");
        int y=sc.nextInt();
        int g = gcd(x,y);
        int lcm = (x*y)/g;
        System.out.println("LCM = " + lcm);
    }
}

