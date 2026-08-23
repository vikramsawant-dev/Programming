class Logic
{
    void CountEvenOddRange(int num)
    {
        int iCnt = 0;
        int iEven = 0;
        int iOdd = 0;

       for(iCnt = 1; iCnt <= num; iCnt ++)
       {
        if(iCnt % 2 == 0)
        {
            iEven++;
        }
        else
        {
            iOdd++;
        }
       }
        System.out.println("Even number is :"+iEven);
        System.out.println("Odd number is :"+iOdd);
    }
}

public class program97
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.CountEvenOddRange(50);
    }
}
