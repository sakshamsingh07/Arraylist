import java.util.ArrayList; 
import java.util.Scanner;
public class allaboutAl
{
    public static void main(String []args)
    {
        Scanner scn =new Scanner(System.in);
        int [] data = {1,4,8,16,47,89};
    //    create arraylist-------------------------------------------
        ArrayList<Integer>al= new ArrayList<>();

    //    print arraylist-----------------------------------------------
    
    al.add(20);//(value added)
     // by loop
     for(int i=0 ;i<al.size();i++)
     {
         System.out.println(al.get(i));
     }
    //   by for each loop
    System.out.println("for each loop");
    for (int x:al)
    {
        System.out.println(x);
    }

    // add value in arraylist-------------------------------------------

    System.out.println("addind data array to arraylist");

     // by for each loop

    System.out.println("by for each loop");
    for(int x:data)
    {
        al.add(x);
    }
    System.out.println(al);

    // by loop

    System.out.println("by loop");
    for (int i=0;i<data.length;i++)
    {
        al.add(i);
    
    System.out.println(al.get(i));
    }

    // get value at----------------------------------------------------------------------


    System.out.println("get value");
    int val=al.get(2);
    System.out.println("value at second index is:"+val);

    

    
    }
    
}
