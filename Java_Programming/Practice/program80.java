class Logic
{
    void printTable(int a)
    {
        int iCnt = 0;
        int iMult = 1;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
           iMult = 5 * iCnt;
           System.out.println(iMult);
        }
    }
}

class program80
{
    public static void main (String A[])
    {
        Logic lobj = new Logic();
        lobj.printTable(5);
    }
}