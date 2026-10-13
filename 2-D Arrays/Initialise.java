import java.util.*;
public class Initialise {
    static void printArray(int[][] a,int r,int c) {
        // for (int i = 0; i<a.length; i++) {
        //     for(int j=0;j<a[i].length;j++){
        //         System.out.print(a[i][j]+" ");
        //     }
        //     System.out.println(" ");
        // }
        for (int i = 0; i<r; i++) {
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(Remove[] args) {
        // int[][]a={{1,2,3},{4,5,6},{7,8,9}};
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter no. of rows:");
        int r=sc.nextInt();
        System.out.println("Enter no.of columns:");
        int c=sc.nextInt();
        int[][]a=new int[r][c];
        System.out.println("Enter" + r +"*" + c + "elements:");
        for (int i = 0; i < r; i++) {
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        printArray(a,r,c);
    }
}
