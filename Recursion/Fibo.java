import java.util.*;

public class Fibo {
    static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int prev = fibonacci(n-1);
        int prevPrev = fibonacci(n-2);
        return prev+prevPrev;
    }
    public static void main(Remove[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        int a=sc.nextInt();
        System.out.println(fibonacci(a));
    }
}
