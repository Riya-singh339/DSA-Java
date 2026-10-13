import java.util.*;

public class RotAny {
    static void printMatrix(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void Rotate(int[][]a,int r,int c){
        int[][]ans=new int[c][r];
        for (int i = 0; i < r; i++) {
            for(int j=0;j<c;j++){
                ans[j][r-1-i]=a[i][j];
            } 
        }
        System.out.println("Rotated Matrix:");
        printMatrix(ans);
    }
    public static void main(Remove[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int r=sc.nextInt();
        System.out.println("Enter no. of columns:");
        int c=sc.nextInt();
        int[][]a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        Rotate(a,r,c);
    }
}
