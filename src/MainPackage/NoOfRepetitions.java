package MainPackage;

public class NoOfRepetitions {

    public static void main (String args [])
    {
        int arr[] = {12,14,16,21,28,29,20,14,17};
        int search_element = 14;
        int repetition = 0;

        for (int x : arr)
        {
            if (x == search_element)
            {
                repetition ++;
            }
        }

        System.out.println("No of repetition : " + repetition);

    }

}
