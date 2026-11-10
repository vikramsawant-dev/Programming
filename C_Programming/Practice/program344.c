#include <stdio.h>

typedef unsigned int UNIT;

//position 9th and 17th
int main()
{
    UNIT iMask = 0x00010100;
    UNIT iNo = 0;
    UNIT iResult = 0;

    printf("Enter number :\n");
    scanf("%d", &iNo);
    
    iResult = iNo ^ iMask;

    printf("Updated number :%d\n",iResult);
    return 0;
}