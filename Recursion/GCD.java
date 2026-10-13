import java.util.*;

public class GCD {
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
        System.out.println(gcd(x,y));
    }
}

