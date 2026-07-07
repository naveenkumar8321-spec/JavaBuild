package MainPackage;

import java.util.Arrays;

public class Sorting {

    public static void main (String args[])
    {
        int a[] = {4,6,3,23,56,45};
        System.out.println("Before Sorting: " + Arrays.toString(a));

        Arrays.sort(a);
        System.out.println("After Sorting: " + Arrays.toString(a));
        System.out.print("");

        String arr[] = {"Naveen","Kumar","Praveena","Ilan"};
        System.out.println("Before Sorting: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));



    }


}
