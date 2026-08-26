#include<stdio.h>

int DollarToINR( int iNo)
{
    int iCnt = 70;
    int iSum = 0;

    iSum = iCnt * iNo;

    return iSum;
    
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter the number :\n");
    scanf("%d",&iValue);

    iRet = DollarToINR(iValue);
    printf("Value in INR is :%d",iRet);

    return 0;
}