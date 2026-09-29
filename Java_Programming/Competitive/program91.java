class Logic
{
    void SumEvenNumber(int n)
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
        System.out.println("Addition is Even number :"+iSum);
    }
}

public class program91
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.SumEvenNumber(10);
    }
}
