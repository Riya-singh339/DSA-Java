import java.util.*;
public class Natural {
    static void natural(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        natural(n-1);
        System.out.println(n);
    }
    public static void main(Remove[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        int a=sc.nextInt();
        natural(a);
    }
}
