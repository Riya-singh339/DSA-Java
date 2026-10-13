import java.util.*;

public class Max {
    static int gcd (int x,int y){
        if(y == 0){
            return x;
        }
        return gcd(y,x%y);
    }
    public static void main(Remove[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int[]a=new int [n];
        System.out.println("Enter the values of array:");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    }
}

