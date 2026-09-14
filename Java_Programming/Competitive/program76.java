class Logic
{
    void SumOfDigits(int num)
    {
        int iSum = 0;
        int iCnt = 0, iAdd = 0;

        for(iCnt = 0; iCnt >= 0; iCnt++)
        {
            iSum = num % 10;
            iAdd = iSum + iAdd;
            num = num / 10;
        }
        System.out.println("Summetion is :"+iAdd);
    }
}

class program76
{
    public static void main (String A[])
    {
        Logic lobj = new Logic();
        lobj.SumOfDigits(1234);
    }
}