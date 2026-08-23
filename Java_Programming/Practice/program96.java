class Logic
{
    void productOfDigit(int num)
    {
        int iCnt = 1;
        int iDigit = 0;

        while(num != 0)
        {
            iDigit = num % 10;

            iCnt = iDigit * iCnt;

            num = num / 10;
        }
        System.out.println("Product of digit is :"+iCnt);
    }
}

public class program96
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.productOfDigit(234);
    }
}
