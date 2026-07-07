package MainPackage;

public class Array {

    public static void main (String args[])
    {
        //Array
        int arr[] = {23,43,55,66,76,34,12};

        System.out.println("Array Length is : " + arr.length);

//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }

        for (int num : arr)
        {
            System.out.println(num);
        }


    }
}
