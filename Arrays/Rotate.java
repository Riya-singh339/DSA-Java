import java.util.*;
public class Rotate {
    static int[] rotate(int[]a,int n,int target){
        target=target%n;
        int[]ans=new int[n];
        int j=0;
        for(int i=n-target;i<n;i++){
            ans[j++]=a[i];
        }
        for (int i = 0; i < n-target; i++) {
            ans[j++]=a[i];
        }
        return ans;
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
        System.out.println("Enter the no. of times to be rotated:");
        int target=sc.nextInt();
        int[]ans=rotate(a,n,target);
        System.out.println(Arrays.toString(ans));
    }
}
