import java.util.*;

public class Prefix {
    static int[] PrefixSum(int[]a,int n){
        int[]pref=new int[n];
        pref[0]=a[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1] + a[i];
        }
        return pref;
    }
    public static void main(Remove[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[]a=new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int[]x=PrefixSum(a, n);
        System.out.println(Arrays.toString(x));
    }
}
