import java.util.*;

public class ArraySum {
    static int Sum(int[] a,int i){
        if(i==a.length-1){
            return a[i];
        }
        int ans = Sum(a,i+1);
        return ans+a[i];
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
        System.out.println(Sum(a,0));
    }
}