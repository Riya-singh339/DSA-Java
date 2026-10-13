import java.util.*;

public class Multiply {
    static void printMatrix(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void Multiplication(int[][]a,int[][]b,int r1,int c1,int r2,int c2){
        if(c1!=r2){
            System.out.println("Not possible");
            return;
        }
        int[][]c=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    c[i][j]+=(a[i][k]*b[k][j]);
                }
            }
        }
        printMatrix(c);
    }
    public static void main(Remove[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows and columns of matrix:");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][]a=new int[r1][c1];
        System.out.println("Enter matrix value:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter no. of rows and columns of matrix:");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][]b=new int[r2][c2];
        System.out.println("Enter matrix value:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        Multiplication(a,b,r1,c1,r2,c2);
    }
}
