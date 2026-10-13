import java.util.*;

public class prefQues {
    static int[] PrefixInplace(int[]a,int n){
        for(int i=1;i<n;i++){
            a[i]=a[i-1] + a[i];
        }
        return a;
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
        int[]x=PrefixInplace(a, n);
        System.out.println(Arrays.toString(x));
    }
}
