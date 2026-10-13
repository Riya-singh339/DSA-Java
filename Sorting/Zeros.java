import java.util.*;
public class Zeros{
    static void bubblesort(int[]a,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[j-1]==0 && a[j]!=0){
                    int temp = a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a=new int[n];
        for (int i = 0; i < n; i++) { 
            a[i]=sc.nextInt();  
        }
        bubblesort(a,n);
        for(int i:a){
            System.out.println(i);
        }
    }
}