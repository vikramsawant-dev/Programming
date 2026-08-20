class Logic
{
    void printEvenNumber(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt <=iNo; iCnt++)
        {
            System.out.println(iCnt);
        }
    }
}

public class program82
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.printEvenNumber(20);
    }
}
