import java.util.*;

public class Power {
    static int power (int p,int q){
        if(q==0) return 1;
        int ans = power(p,q-1);
        return ans*p;
    }
    public static void main(Remove[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        int p=sc.nextInt();
        System.out.println("Enter the power");
        int q=sc.nextInt();
        System.out.println(power(p,q));
    }
}
