class Logic
{
    void printReverse(int n)
    {
        int iCnt = 0;

        for(iCnt = n; iCnt >= 0; iCnt--)
        {
            System.out.println(iCnt);
        }
        
    }
}

public class program92
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.printReverse(10);
    }
}
