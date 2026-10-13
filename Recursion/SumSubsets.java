import java.util.*;

public class SumSubsets {
    static void subsetSum(int[]a,int n,int i,int sum){
        if(i>=n){
            System.out.println(sum);
            return;
        }
        subsetSum(a,n,i+1,sum+a[i]);
        subsetSum(a,n,i+1,sum);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        int[]a={2,4,5};
        subsetSum(a,a.length,0,0);
    }
}
