import java.util.*;

public class pQquery{
    static int[] PrefixSum(int[]a,int n){
        for(int i=1;i<=n;i++){
            a[i]=a[i-1] + a[i];
        }
        return a;
    }
    public static void main(Remove[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[]a=new int[n+1];
        System.out.println("Enter elements of array:");
        for (int i = 1; i <= n; i++) {
            a[i]=sc.nextInt();
        }
        int[]x=PrefixSum(a, n);
        System.out.println("Enter no. of queries:");
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("Enter range:");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans = x[r] - x[l-1];
            System.out.println(ans);
        }
    }
}
