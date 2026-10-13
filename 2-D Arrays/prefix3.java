import java.util.*;

public class prefix3 {
    static int[][] PrefixofMatrix(int[][]a,int r,int c){
        // int sum=0;
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                a[i][j]+=a[i][j-1];
            }
        }
        for(int j=0;j<c;j++){
            for(int i=1;i<r;i++){
                a[i][j]+=a[i-1][j];
            }
        }
        return a;
    }
    static int prefixSum(int[][]a,int r,int c,int l1,int l2,int r1,int r2){
        int left=0,up=0,upleft=0;
        PrefixofMatrix(a,r,c);
        int sum=a[l2][r2];
        if(r1>=1){
            left=a[l2][r1-1];
        }
        if(l1>=1)
        up=a[l1-1][r2];
        if(l1>=1 && r1>=1)
        upleft=a[l1-1][r1-1];
        int ans=sum-up+upleft;
        return ans;
    }
    public static void main(Remove[]args){
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
