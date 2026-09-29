/*
    iRow = 6
    iCol = 6
    
    *
    *   *
    *   $   *
    *   $   $   *
    *   $   $   $   *
    *   *   *   *   *   *
*/
import java.util.*;

class Pattern 
{

    public void Display(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        char ch = '\0';

        if(iRow != iCol)
        {
            System.out.println("Invalid parameters");
            System.out.println("No of rows and column should be same");
            return;
        }
        

        for(i = 1, ch = 'a'; i <= iRow; i++)
        {
            for(j = 1; j <= i; j++,ch++)
            {
                if(i == j||j == 1 || i == iRow)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("$\t");
                }
            }
            System.out.println();
        }
        
    }
}
class program228
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter number of rows :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of column :");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
        
    } 
}
