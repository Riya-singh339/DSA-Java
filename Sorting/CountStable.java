import java.util.*;
public class CountStable{
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
        int[]output=new int[n];
        for(int i=0;i<n;i++){
            count[a[i]]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int idx=count[a[i]]-1;
            output[idx]=a[i];
            count[a[i]]--;
        }
        for(int i=0;i<n;i++){
            a[i]=output[i];
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