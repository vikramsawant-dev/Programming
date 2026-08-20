#include<stdio.h>

void PrintEven(int iNo)
{
    int i = 0;

    if( iNo <= 0)
    {
        return ;
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number\n");
    scanf("%d", &iValue);

    PrintEven(iValue);
    return 0;
}