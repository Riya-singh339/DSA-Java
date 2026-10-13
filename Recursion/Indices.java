import java.util.*;

public class Indices {
    static void index (int[]a,int i,int t){
        if(i == a.length){
            return;
        }
        if(a[i]==t){
            System.out.println(i);
        }
        index(a,i+1,t);
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
        System.out.println("Enter the target:");
        int t=sc.nextInt();
        index(a,0,t);
    }
}
