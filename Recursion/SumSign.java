import java.util.*;

public class SumSign {
    static int Sum (int n){
        if(n == 0) return 0;
        if(n%2 == 0){
            return Sum (n-1)-n;
        }else{
            return Sum (n-1)+n;
        }
    }
    public static void main(Remove[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        int n=sc.nextInt();
        System.out.println(Sum(n));
    }
}
