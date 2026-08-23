class Logic
{
    void DisplayFactors(int num)
    {
        int iCnt = 0;

        System.out.println("Factors of"+num);

       for(iCnt = 1; iCnt < num; iCnt ++)
       {
        if(num % iCnt == 0)
        {
            System.out.println(iCnt);
        }
       }
    }
}

public class program98
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.DisplayFactors(12);
    }
}
