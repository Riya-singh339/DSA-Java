import java.util.*;
public class MAXValue {
    static int MAX_VALUE(int[]a,int i){
        if(i==a.length-1){
            return a[i];
        }
        int mx=MAX_VALUE(a,i+1);
        return Math.max(a[i],mx);
    }
    public static void main(Remove[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values of array:");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println(MAX_VALUE(a,0));
    }
}
