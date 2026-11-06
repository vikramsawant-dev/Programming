#include <stdio.h>

typedef unsigned int UNIT;

int main()
{
    UNIT iMask = 0x1;
    UNIT iNo = 0;
    UNIT iPos = 0;

    printf("Enter number :\n");
    scanf("%d",&iNo);

    printf("Enter the bit position :\n");
    scanf("%d",&iPos);

    iMask = iMask << (iPos - 1);
    
    iNo = iNo ^ iMask;

    printf("Updated number : %d\n",iNo);
    
    return 0;
}