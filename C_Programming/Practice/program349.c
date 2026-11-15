#include <stdio.h>

typedef unsigned int UNIT;

//position 3 and 8
int main()
{
    UNIT iMask1 = 0x1;
    UNIT iMask2 = 0x1;
    UNIT iMask = 0;

    UNIT iNo = 0;
    UNIT iResult = 0;
    UNIT iPos = 0 ;

    printf("Enter number :\n");
    scanf("%d", &iNo);
    
    iMask1 = iMask1 << 2;
    iMask2 = iMask2 << 7;

    iMask=  iMask1 | iMask2;
    iResult = iNo ^ iMask;

    printf("Updated number :%d\n",iResult);
    return 0;
}