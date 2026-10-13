import java.util.*;
public class Sl {
    static int[] findSmallestLargest(int[]a,int n){
        int small=a[0];
        int largest=a[0];
        for (int i = 0; i < n; i++) {
            if(a[i]<small){
                small=a[i];
            }
            if(a[i]>largest){
                largest=a[i];
            }
        }
        int[]b={small,largest};
        return b;
    }
    public static void main(Remove[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[]a=new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int[]x=findSmallestLargest(a,n);
        // System.out.println(a[0]);
        // System.out.println(a[1]);
        System.out.println(Arrays.toString(x));
    }
}
