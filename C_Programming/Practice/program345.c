#include <stdio.h>

typedef unsigned int UNIT;

//position 12 and 23
int main()
{
    UNIT iMask = 0x00400800;
    UNIT iNo = 0;
    UNIT iResult = 0;

    printf("Enter number :\n");
    scanf("%d", &iNo);
    
    iResult = iNo ^ iMask;

    printf("Updated number :%d\n",iResult);
    return 0;
}