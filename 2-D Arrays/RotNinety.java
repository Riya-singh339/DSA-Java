import java.util.*;

public class RotNinety {
    static void printMatrix(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void reverse(int[]a){
        int i=0,j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
    static void swap(int[][]a,int i,int j){
        int temp=a[i][j];
        a[i][j]=a[j][i];
        a[j][i]=temp;
    }
    static void Rotate(int[][]a,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=i+1;j<c;j++){
                swap(a,i,j);
            }
        }
        for(int i=0;i<r;i++){
            reverse(a[i]);
        }
        printMatrix(a);
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
