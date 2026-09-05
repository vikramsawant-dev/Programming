//Input: 7
//Output: 1   *   2   *   3   *   4
//        1   2   3   4   5   6   7 
import java.util.*;

class program179
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        char ch = 'a';

        for(iCnt = 1; iCnt <=iNo; iCnt++)
        {
            System.out.print(ch+"\t");
            ch++;
        }
        System.out.println();
    }
    public static void main(String A[] )
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number of elements :");
        iValue = sobj.nextInt();
        
        Display(iValue);
    }
}
