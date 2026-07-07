package MainPackage;

import java.util.Arrays;

public class ArrayReverse {

    public static void main (String args [])
    {
        int arr[] = {23,54,56,67,55,21,43,55};
        System.out.println("Before : " +Arrays.toString(arr));

        for (int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }


    }
}
