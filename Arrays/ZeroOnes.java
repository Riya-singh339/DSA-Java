import java.util.*;
public class ZeroOnes {
    static void ZerosOnes(int[]a,int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                a[i]=0;
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            if(i<count){
                a[i]=0;
            }else{
                a[i]=1;
            }
        }
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
        ZerosOnes(a,n);
        System.out.println(Arrays.toString(a));
    }
}
