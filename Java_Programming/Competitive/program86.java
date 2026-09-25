class Logic
{
    void CheckLeapYear(int iNo)
    {
        if((iNo % 4 == 0 && iNo % 100 != 0) || (iNo % 400 == 0))
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a Leap year");
        }
    }
}

public class program86
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.CheckLeapYear(2024);
    }
}
