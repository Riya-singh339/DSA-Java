import java.util.*;

public class NonDecreasing {
    static int[] SortSquares(int[]a,int n){
        int i=0,j=n-1;
        int[]ans=new int[n];
        int k=0;
        while(i<j){
            if(Math.abs(a[i])>Math.abs(a[j])){
                ans[k++] = a[i] * a[j];
                i++;
            }else{
                ans[k++] = a[i] * a[j];
                j--;
            }
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
        int[]ans=SortSquares(a,n);
        System.out.println(Arrays.toString(ans));
    }
}
