import java.util.*;

public class Spiral {
    static void printMatrix(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void SpiralMatrix(int[][]matrix,int r,int c){
        int top=0,rightcol=c-1,bottom=r-1,leftcol=0;
        while(top<=bottom && leftcol<=rightcol){
            //top row
            for(int j=0;j<=rightcol;j++){
                System.out.print(matrix[top][j]+" ");
            }
            top++;
            System.out.println();

            //rightcol
            for(int i=top;i<=bottom;i++){
                System.out.print(matrix[i][rightcol]+" ");
            }
            rightcol--;
            System.out.println();

            //bottomrow
            for(int j=rightcol;j>=leftcol;j--){
                System.out.print(matrix[bottom][j]+ " ");
            }
            bottom--;
            System.out.println();

            //leftcol
            for(int i=bottom;i>=top;i--){
                System.out.print(matrix[i][leftcol]+" ");
            }
            leftcol++;
            System.out.println();
        }
        printMatrix(matrix);
    }
    public static void main(Remove[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter now of rows:");
        int r=sc.nextInt();
        System.out.println("Enter now of cols:");
        int c=sc.nextInt();
        int[][]a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        SpiralMatrix(a,r,c);
    }
}
