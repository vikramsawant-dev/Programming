#include <stdio.h>

typedef unsigned int UNIT;

//position 4
int main()
{
    UNIT iMask = 0xFFFFFFF7;
    UNIT iNo = 0;
    UNIT iPos = 0;

    printf("Enter number :\n");
    scanf("%d",&iNo);
    
    iNo = iNo & iMask;

    printf("Updated number is : %d\n",iNo);
    
    return 0;
}