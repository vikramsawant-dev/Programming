#include <stdio.h>
void RangeDisplay(int iStart , int iEnd)
{
    int iCnt = 0;
    
    if(iStart < 0)
    {
       int iStart = -iStart;
    }
    for(iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        printf("%d",iCnt);
    }

}
int main()
{
    int iValue1 = 0;
    int iValue2 = 0;

    printf("Enter the number \n");
    scanf("%d",&iValue1);

    printf("Enter the number \n");
    scanf("%d",&iValue2);

    RangeDisplay(iValue1,iValue2);

    return 0;
}