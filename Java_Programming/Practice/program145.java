import java.util.*;

class program145 
{
    public static void Update(int Arr[])
    {
        int iCnt = 0;
        for(iCnt = 0;iCnt <Arr.length; iCnt++)
        {
            Arr[iCnt]++;
        }
    }
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[]={10,20,30,40,50};
        int iCnt = 0;

        System.out.println("Enter the number of elements :"); 
        int iLength = sobj.nextInt();

        int Brr[] = new int [iLength];

        System.out.println("Array elements before function call :\n");
        for(iCnt = 0; iCnt <5; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
        Update(Brr);

        System.out.println("Array elements after function call :\n");
        for(iCnt = 0; iCnt <Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        } 
    }

    
}
