import java.util.*;

public class HCF {
    static int Hcf (int x,int y,int r){
        while(x%y!=0){
            r=x%y;
            x=y;
            y=r;
        }
        return y;
    }
    public static void main(Remove[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        int x=sc.nextInt();
        System.out.println("Enter the 2nd input");
        int y=sc.nextInt();
        int rem=0;
        System.out.println(Hcf(x,y,rem));
    }
}
