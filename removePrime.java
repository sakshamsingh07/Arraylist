import java.util.Scanner; 
import java.util.ArrayList;
public class removePrime
{
    public static boolean prime(int n)
    {
        for (int i =2;i*i<n;i++)
        {
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void removeprimes(ArrayList<Integer> al)
    {
        for (int i = al.size()-1;i>=0;i--)
        {
            if (prime(al.get(i)))
            {
                al.remove(i);
            }
        }
    }
    public static void main(String []args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i <al.size();i++)
        {
            al.add(scn.nextInt());

        }
        removeprimes(al);
        System.out.println(al);

    }

    
}
