import java.util.*;
class Last{
    static int findLastOcurrence (int[]a,int x,int n){
        int LastIndex = -1;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                LastIndex=i;
            }
        }
        return LastIndex;
    }
    public static void main(Remove[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[]a=new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element:");
        int x = sc.nextInt();
        int result=findLastOcurrence(a, x, n);
        System.out.println(result);
    }
}