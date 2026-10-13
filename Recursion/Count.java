import java.util.*;

public class Count {
    static int countofdigits(int n,int c){
        if(n>=0 && n<=9){
            c++;
            return c;
        }
        return countofdigits(n/10,c+1);
    }
    public static void main(Remove[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        int a=sc.nextInt();
        int c=0;
        System.out.println(countofdigits(a,c));
    }
}
