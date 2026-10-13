import java.util.*;
public class Merge {
    static void merge(int[]a,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[]left=new int[n1];
        int[]right=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=a[l+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=a[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                a[k++]=left[i++];
            }else{
                a[k++]=right[j++];
            }
        }
        while(i<n1){
            a[k++]=left[i++];
        }
        while(j<n2){
            a[k++]=right[j++];
        }
    }
    static void mergesort(int a[],int l,int r){
        if(l>=r) return;
        int mid=(l+r)/2;
        mergesort(a,l,mid);
        mergesort(a,mid+1,r);
        merge(a,l,mid,r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n=sc.nextInt();
        int[]a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        mergesort(a,0,n-1);
        for(int val:a){
            System.out.println(val+" ");
        }
    }
}
