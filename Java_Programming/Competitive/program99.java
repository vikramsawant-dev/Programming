class Logic
{
    void CountFactors(int num)
    {
        int iCnt = 0;
        int iCount = 0;

        System.out.println("Factors of "+num);

       for(iCnt = 1; iCnt < num; iCnt ++)
       {
        if(num % iCnt == 0)
        {
            iCount++;
        }
       }
       System.out.println("Total factors is :"+iCount);
    }
}

public class program99
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.CountFactors(20);
    }
}
