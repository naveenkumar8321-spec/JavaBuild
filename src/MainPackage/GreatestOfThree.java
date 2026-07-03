package MainPackage;

public class GreatestOfThree {

    public static void main(String args[])
    {
        int a = 10,b=13,c=7;

        if ((a>b) && (a>c))
        {
            System.out.println("A is the Greatest number");
        }
        else if ((b>a) && (b>c))
        {
            System.out.println("B is the Greatest number");
        }
        else
        {
            System.out.println("C is the Greatest number");
        }

        int d = 80, e=45;

        int result = (d>e) ?d :e;

        System.out.println(result);

   }

}
