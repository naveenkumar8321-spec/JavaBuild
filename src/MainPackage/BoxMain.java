package MainPackage;

public class BoxMain {

    public static void main (String args[])
    {
       Box b = new Box(5);
       double calculatedVolume = b.calVolume();
       System.out.println(calculatedVolume);
    }



}
