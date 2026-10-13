import java.util.*;

public class Suffix{
    static int TotalSum(int[]a,int n){
        int totalsum=0;
        for(int i=0;i<n;i++){
            totalsum+=a[i];
        }
        return totalsum;
    }
    static boolean PrefixSuffix(int[]a,int n){
        int totalSum=TotalSum(a, n);
        int prefSum=0;
        for(int i=0;i<n;i++){
            prefSum += a[i];
            int suffixSum = totalSum - prefSum;
            if(suffixSum == prefSum){
                return true;
            }
        }
        return false;
    }
    public static void main(Remove[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[]a=new int[n+1];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println(PrefixSuffix(a, n));
    }
}
