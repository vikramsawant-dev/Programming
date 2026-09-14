/*
    iRow = 4
    iCol = 4

    @   @   @   $
    @   @   $   @
    @   $   @   @
    $   @   @   @

*/

import java.util.*;

class Pattern 
{
    int i = 0;
    int j = 0;

    public void Display(int iRow, int iCol)
    {
        for(i = iRow; i >= iRow; i--)
        {
            for(j = 1 ; j <= iCol; j++)
            {
                if(i == j)
                {
                    System.out.print("$\t");  //diagonal
                }
                else
                {
                    System.out.print("@\t");
                }
            }
            System.out.println();
        }
        
    }
}
class program210
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
