import java.util.*;
public class Reverse {
    static int[] reverse(int[]a,int n){
        int i=0,j=n-1;
        while(i<j) {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
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
        System.out.println("Enter the target:");
        int target=sc.nextInt();
        int[]result=reverse(a,n);
        System.out.println(Arrays.toString(result));
    }
}
