class Logic
{
    void CheckSign(int iNo)
    {
        if(iNo < 0)
        {
            System.out.println("It is negative");
        }
        else if(iNo > 0)
        {
            System.out.println("It is postive");
        }
        else
        {
            System.out.println("It is zero");
        }
    }
}

public class program85
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.CheckSign(-8);
    }
}
