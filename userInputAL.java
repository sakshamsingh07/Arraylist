import java.util.ArrayList;
import java.util.Scanner;
public class userInputAL 
{
    public static void main(String []args)
   {
    //    get size--------------------------------------------------------------------
        Scanner scn = new Scanner (System.in);
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            al.add(i);
        }
        System.out.println("current size is:"+al.size());
        // user input------------------------------------------------------------------
        for(int i=0;i<3;i++)
        {
            al.add(scn.nextInt());
        }
        System.out.println("now sixe is:"+al.size());
        System.out.println(al);
        // remove or delete----------------------------------------------------------------
        System.out.println("remove the element in arraylist");
        al.remove(6);
        System.out.println(al);
        System.out.println("remove size");
        al.remove(al.size()-1);
        System.out.println(al);
        // set function-----------------------------------------------------------------
        System.out.println("using set function");
        System.out.println(al);
        al.set(1,67);
        System.out.println(al);

    }
    
}
