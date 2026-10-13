import java.util.*;
public class Selection{
    static void Selectionsort(int[]a,int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp = a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[]a=new int[n];
        for (int i = 0; i < n; i++) { 
            a[i]=sc.nextInt();  
        }
        Selectionsort(a,n);
        for(int i:a){
            System.out.println(i);
        }
    }
}