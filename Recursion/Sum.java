import java.util.*;

public class Sum {
    static int sumofdigits(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int ans = sumofdigits(n/10);
        return ans + (n%10);
    }
    public static void main(Remove[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        int a=sc.nextInt();
        System.out.println(sumofdigits(a));
    }
}
