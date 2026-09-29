class Logic
{
    void CheckPerfect(int n)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 == 0);
            {
                iSum = iCnt + iSum;
            }
        }
        if(n  == iSum)
        {
            System.out.println(iSum+"is perfect number");
        }
        else
        {
            System.out.println("it is not perfect number");
        }
    }
}

public class program93
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.CheckPerfect(27);
    }
}
