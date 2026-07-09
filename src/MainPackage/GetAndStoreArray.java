package MainPackage;

import java.util.Arrays;
import java.util.Scanner;

public class GetAndStoreArray {

    public static void main (String args[])
    {
        int a[] = new int [5];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the value to add in array : ");
            a[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(a));
    }
}
