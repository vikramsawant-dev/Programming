class Logic
{
    void SumEvenOddNumber(int iNo)
    {
        int iCnt = 0;
        int iEven = 0;
        int iOdd = 0;
        int iDigit = 0;

        for(iCnt = 0; iCnt >= 0; iCnt++)
        {
            iDigit = iNo % 2;

            if(iCnt % 2 == 0)
            {
                iEven = iDigit + iEven;
            }
            else
            {
                iOdd = iDigit + iOdd;
            }
            iNo = iNo / 10;
        }
        /*
        while(num != 0)
        {
            digit = num % 10;

            if(digit % 2 == 0)
            {
                evenSum = evenSum + digit;
            }
            else
            {
                oddSum = oddSum + digit;
            }
            num = num / 10;
        }
        */ 
        System.out.println("Sum of Even Digitd :"+iEven);
        System.out.println("Sum of Odd Digitd :"+iOdd);
    }
}

public class program84
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.SumEvenOddNumber(123456);
    }
}
