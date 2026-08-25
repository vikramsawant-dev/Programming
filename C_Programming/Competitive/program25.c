#include<stdio.h>
void MultipleDisplay( int iNo)
{
    int iCnt = 0;
    int iSum = 0;
    
    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        iSum = iCnt * iNo;
        printf("%d",iSum);
    }

}
int main()
{
    int iValue = 0;

    printf("Enter the number :\n");
    scanf("%d",&iValue);

    MultipleDisplay(iValue);

    return 0;
}