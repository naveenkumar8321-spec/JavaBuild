package MainPackage;

public class SearchElementArray {

    public static void main (String args[])
    {
        //search an element in array
        int Element = 170;
        boolean found = false;
        int arr[] = {100,120,210,350,105,600,700};

        for (int x : arr)
            {
                if (x == Element)
                {
                   System.out.println("Element is present in Array  :" + x );
                   found =  true;
                   break;
                }

            }
        if (found == false)
            {
                System.out.println("Element not found in Array");

            }
    }

}
