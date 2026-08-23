class Logic
{
    void CheckDivisible(int num)
    {
        if(num % 5 == 0 && num % 11 == 0)
        {
            System.out.println("This Number is Divisible");
        }
        else
        {
            System.out.println("This Number is not Divisible");
        }
    }
}

public class program88
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.CheckDivisible(55);
    }
}
