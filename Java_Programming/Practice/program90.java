class Logic
{
    void CalculatePower(int base, int exp)
    {
        int iCnt = 0;
        int iPow = 1;

        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            iPow = base * iPow;
        }
        System.out.println("Power is :"+iPow);
    }
}

public class program90
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.CalculatePower(2,5);
    }
}
