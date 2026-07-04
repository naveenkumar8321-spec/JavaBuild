package MainPackage;

public class Looping {

    public static void main (String args[])
    {
        //print num 1 to 10 with while loop
        int i=1;

//        while(i<11)
//        {
//            System.out.println(i);
//            i++;
//        }

//        do {
//                System.out.println(i);
//                i++;
//            } while(i<11);

        //print even num bw 1 to 10

        while(i<11)
        {
            if(i%2 == 0)
            {
                System.out.println(i);
            }
            i++;
        }

    }

}
