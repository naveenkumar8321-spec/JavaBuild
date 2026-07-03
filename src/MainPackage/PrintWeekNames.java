package MainPackage;

public class PrintWeekNames {

    public static void main (String args[])
    {
        //Print Week Names
        // 1 = Monday, 2 + Tuesday

        int WeekNum = 3;

        if (WeekNum == 1)
        {
            System.out.println("Monday");
        }
        else if (WeekNum == 2)
        {
            System.out.println("Tuesday");
        }
        else if (WeekNum == 3)
        {
            System.out.println("Wed");
        }
        else if (WeekNum == 4)
        {
            System.out.println("Thurs");
        }
        else if (WeekNum == 5)
        {
            System.out.println("Friday");
        }
        else if (WeekNum == 6)
        {
            System.out.println("Sat");
        }
        else if (WeekNum == 7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Invalid Num");
        }

    }
}
