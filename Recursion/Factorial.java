import java.util.*;

public class Factorial {
    static int fact(int n){
        if(n==0){
            return 1;
        }
        int ans = fact(n-1);
        return ans*n;
    }
    public static void main(Remove[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        int a=sc.nextInt();
        System.out.println(fact(a));
    }
}
