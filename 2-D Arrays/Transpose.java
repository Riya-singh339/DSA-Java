import java.util.*;

public class Transpose {
    static void printMatrix(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void swap(int[][]a,int i,int j){
        int temp=a[i][j];
        a[i][j]=a[j][i];
        a[j][i]=temp;
    }
    static void Multiplication(int[][]a,int r1,int c1){
        if(r1!=c1){
            System.out.println("Not possible");
            return;
        }
        for(int i=0;i<r1;i++){
            for(int j=i+1;j<c1;j++){
                if(i!=j){
                    swap(a,i,j);
                }
            }
        }
        printMatrix(a);
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
        Multiplication(a,r1,c1);
    }
}
