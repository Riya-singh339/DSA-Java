import java.util.*;
public class Radix{
    static int findMax(int[]a,int n){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>mx){
                mx=a[i];
            }
        }
        return mx;
    }
    static void countsort(int[]a,int place,int n){
        int[]output=new int[n];
        int[]count=new int[10];
        for(int i=0;i<n;i++){
            count[(a[i]/place)%10]++;
        }
        for(int i=1;i<10;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int idx=count[(a[i]/place)%10]-1;
            output[idx]=a[i];
            count[(a[i]/place)%10]--;
        }
        for (int i = 0; i<n; i++) {
            a[i]=output[i];
        }
    }
    static void radixSort(int[]a,int n){
        int max=findMax(a,n);
        for(int place=1;max/place>0;place*=10){
            countsort(a,place,n);
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
        radixSort(a,n);
        for(int val:a){
            System.out.println(val+" ");
        }
    }
}