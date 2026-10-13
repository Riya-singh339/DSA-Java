import java.util.*;

public class Prefix {
    static int prefixSum(int[][]a,int r,int c,int l1,int l2,int r1,int r2){
        int sum=0;
        for(int i=l1;i<l2;i++){
            for(int j=r1;j<r2;j++){
                sum+=a[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int r=sc.nextInt();
        System.out.println("Enter no. of cols:");
        int c=sc.nextInt();
        int[][]a=new int[r][c];
        for (int i = 0; i < r; i++) {
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the l1 & r1:");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        System.out.println("Enter the l2 & r2:");
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        int ans=prefixSum(a, r, c, l1, l2, r1, r2);
        System.out.println(ans);
    }
}
