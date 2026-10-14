import java.util.*;
public class QuickSort{
    static void swap(int[]a,int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static int partition(int [] a,int s,int l){
        int pivot=a[s];
        int ltpivot=0;
        for(int i=s+1;i<=l;i++){
            if(a[i]<=pivot) ltpivot++;
        }
        int pivotIdx=s+ltpivot;
        swap(a,s,pivotIdx);
        int i=s,j=l;
        while(i<pivotIdx && j>pivotIdx){
            while(a[i]<=pivot) i++;
            while(a[j]>pivot) j--;
            if(i<pivotIdx && j>pivotIdx){
                swap(a,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void quicksort(int[]a,int st,int end){
        if(st>=end){
            return;
        }
        int pi=partition(a,st,end);
        quicksort(a,st,pi-1);
        quicksort(a,pi+1,end);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        System.out.println("Enter values:");
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        quicksort(a,0,n-1);
        for(int val:a){
            System.out.println(val+" ");
        }
    }
}