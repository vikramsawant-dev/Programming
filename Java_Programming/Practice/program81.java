class Logic
{
    void CheckPrime(int num)
    {
        int iCnt = 0;
        int iCount = 1;

        for(iCnt = 1; iCnt <= num; iCnt++)
        {
           if(num % iCnt == 0);
           {
                iCount++;
           }
        }
        if(iCount == 2)
        {
            System.out.println("It is prime");
        }
        else
        {
            System.out.println("It is not prime");
        }
    }
        
}

class program81
{
    public static void main (String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPrime(11);
    }
}