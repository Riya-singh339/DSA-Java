import java.util.*;
public class OddEven {
    static void swap(int[]a,int i,int j){
        while(i<j) {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
    static void Oddeven(int[]a,int n){
        int i=0,j=n-1;
        while(i<j){
            if(a[i]%2!=0 && a[j]%2==0){
                swap(a,i,j);
            }
            if(a[i]%2==0){
                i++;
            }
            if(a[j]%2!=0){
                j--;
            }
        }
    }
    public static void main(Remove[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[]a=new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        Oddeven(a,n);
        System.out.println(Arrays.toString(a));
    }
}
