import java.util.*;

public class LinearSearch {
    static boolean Search(int[] a,int i, int t){
        if(i >= a.length){
            return false;
        }
        if(a[i]==t) return true;
        if(Search(a,i+1,t)){
            return true;
        }else{
            return false;
        }
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
        System.out.println("Enter type target:");
        int t=sc.nextInt();
        if(Search(a,0,t)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
