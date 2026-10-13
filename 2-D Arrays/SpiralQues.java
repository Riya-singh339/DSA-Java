import java.util.Scanner;

public class SpiralQues {
    static void printMatrix(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void SpiralMatrix(int[][]matrix,int n){
        int top=0,rightcol=n-1,bottom=n-1,leftcol=0;
        int num=1;
        while(top<=bottom && leftcol<=rightcol){
            //top row
            for(int j=leftcol;j<=rightcol;j++){
                matrix[top][j]=num++;
            }
            top++;

            //rightcol
            for(int i=top;i<=bottom;i++){
                matrix[i][rightcol]=num++;
            }
            rightcol--;

             //bottomrow
            for(int j=rightcol;j>=leftcol;j--){
                matrix[bottom][j]=num++;
            }
            bottom--;

            //leftcol
            for(int i=bottom;i>=top;i--){
                matrix[i][leftcol]=num++;
            }
            leftcol++;
        }
        printMatrix(matrix);
    }
    public static void main(Remove[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n=sc.nextInt();
        int[][]a=new int[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         a[i][j]=sc.nextInt();
        //     }
        // }
        SpiralMatrix(a,n);
    }
}
