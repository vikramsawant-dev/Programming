#include<stdio.h>

/*
Input : 5
Output : 5  *   4   *   3   *   2   *   1   *
*/

void Pattern(int iNo)
{
    int iCnt = 0;

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("%d\t",iCnt);
        printf("*\t");
    }
}
int main()
{
    int iValue = 0;

    printf("Enter number of elements\n");
    scanf("%d",&iValue);

    Pattern(iValue);

    return 0;
}