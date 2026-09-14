class Logic
{
    void CheckPalindrome(int num)
    {
        int iRev = 0;
        int iCnt = num;
        int iDigit = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            iRev = (iRev* 10) + iDigit;
            num = num / 10;
        }
        if(iCnt == iRev)
        {
            System.out.println("This is Palindrome");
        }
        else
        {
            System.out.println("This is not Palindrome");
        }
    }
}

class program77
{
    public static void main (String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPalindrome(121);
    }
}