import java.util.*;
public class Count{
    static int findMax(int[]a,int n){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>mx){
                mx=a[i];
            }
        }
        return mx;
    }
    static void countSort(int[]a,int n){
        int max=findMax(a,n);
        int[]count=new int[max+1];
        for(int i=0;i<=max;i++){
            count[a[i]]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                a[k++]=i;
            }
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        System.out.println("Enter values:");
        int[]a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        countSort(a,n);
        for(int val:a){
            System.out.println(val+" ");
        }
    }
}