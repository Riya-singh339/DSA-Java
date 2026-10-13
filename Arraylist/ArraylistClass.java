import java.util.ArrayList;

public class ArraylistClass {
    public static void main(Remove[] args) {
        ArrayList <Integer> l1=new ArrayList<>();
        // ArrayList <Float> l2=new ArrayList<>();
        // ArrayList <Boolean> l3=new ArrayList<>();

        l1.add(5);
        l1.add(6);
        l1.add(7);

        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

        //adding element at some index i
        l1.add(1,100);
        System.out.println(l1);
        //modifying element at index i
        l1.set(1,10);
        System.out.println(l1);
        //removing an element at index i
        l1.remove(1);
        System.out.println(l1);
        //removing an element e
        l1.remove(Integer.valueOf(5));//value
        System.out.println(l1);
        //checking if an element exists
        boolean ans=l1.contains(Integer.valueOf(5));//value
        System.out.println(ans);
    }
}
