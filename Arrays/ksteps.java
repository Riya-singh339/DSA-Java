import java.util.*;

public class ksteps {
    static int[] reverse(int i,int j,int[]a){
        while(i<j) {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        return a;
    }
    static int[] rotateInPlace(int[]a,int n,int target){
        target=target % n;
        reverse(0,n-target-1,a);
        reverse(n-target,n-1,a);
        reverse(0,n-1,a);
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
        System.out.println("Enter the no. of times to be rotated:");
        int target=sc.nextInt();
        int[]ans=rotateInPlace(a, n, target);
        System.out.println(Arrays.toString(ans));
    }
}
