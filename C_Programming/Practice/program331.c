#include <stdio.h>

typedef unsigned int UNIT;
//Position 11
int main()
{
    UNIT iMask = 0;
    UNIT iNo = 0;

    printf("Enter number :\n");
    scanf("%d",&iNo);

    iMask = 0x400;
    iNo = iNo ^ iMask;

    printf("Updated number : %d\n",iNo);


    
    return 0;
}