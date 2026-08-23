class Logic
{
    void printDigit(int num)
    {
        int iDigit = 0;

        while (num != 0) 
        {
            iDigit = num % 10;
            System.out.println(iDigit);
            num = num / 10 ;
        }
    }
}

public class program89
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.printDigit(9876);
    }
}
