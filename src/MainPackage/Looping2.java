package MainPackage;

public class Looping2 {

    public static void main (String args[])
    {
        //print num 1 to 10
        // eg : 1 Odd 2 even

        int i = 1;

        while(i<= 10)
        {
            if(i%2 == 0)
            {
                System.out.println(i + " is an even number");
            }
            else
            {
                System.out.println(i + " is an odd number");
            }
            i++;
        }


    }

}
