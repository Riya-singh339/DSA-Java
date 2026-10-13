import java.util.*;

public class Kmultiples {
    static void multiple (int n,int k){
        if(k==0){
            return;
        }    
        multiple(n, k-1);
        System.out.println(n*k);
    }
    public static void main(Remove[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        int n=sc.nextInt();
        System.out.println("Enter the multiple");
        int k=sc.nextInt();
        multiple(n,k);
    }
}
