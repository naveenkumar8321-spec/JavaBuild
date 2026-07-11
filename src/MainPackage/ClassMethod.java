package MainPackage;

public class ClassMethod {

    int EmpId;
    String EmpName;
    int EmpAge;

    void display()
    {
        System.out.println(EmpId + " ," + EmpName + " ," + EmpAge);
    }


    public static void main (String args[])
    {

        ClassMethod Emp1 = new ClassMethod();
        Emp1.EmpId= 001;
        Emp1.EmpAge = 28;
        Emp1.EmpName = "Naveen";

        ClassMethod Emp2 = new ClassMethod();
        Emp2.EmpId= 002;
        Emp2.EmpAge = 21;
        Emp2.EmpName = "Praveena";
        
        Emp1.display();
        Emp2.display();

        // test
    }


}
