class Logic
{
    void printOddNumber(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt <=20; iCnt++)
        {
            if(iCnt % 2 == 1)
            {
                System.out.println(iCnt);
            }
        }
    }
}

public class program83
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.printOddNumber(20);
    }
}
