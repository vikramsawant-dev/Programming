class Logic
{
    void PrintDivisibleBy2and3(int iNo)
    {
        int iCnt = 0;

        System.out.println("Bellow the number is divisible by 2 & 3 :");

       for(iCnt = 1; iCnt < iNo; iCnt ++)
       {
        if((iCnt % 2 == 0) && (iCnt % 3 == 0))
        {
            System.out.println(iCnt);
        }
       }
    }
}

public class program100
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.PrintDivisibleBy2and3(30);
    }
}
