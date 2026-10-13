import java.util.*;
public class Doublet {
    static int doubletSum(int[]a,int n,int target){
        int count=0;
        for (int i = 0; i <n; i++){
            for(int j=i+1;j<n;j++){
                if((a[i]+a[j])==target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(Remove[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[]a=new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the target:");
        int target=sc.nextInt();
        int result=doubletSum(a,n,target);
        System.out.println(result);
    }
}
