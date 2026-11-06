#include <stdio.h>

typedef unsigned int UNIT;

UNIT ToggleBit(UNIT iNo, UNIT iPos)
{
    UNIT iMask = 0x1;
    UNIT iResult = 0;

    iMask = iMask << (iPos - 1);
    iResult = iNo ^ iMask;

    return iResult;

}
int main()
{
    UNIT iLocation = 0x1;
    UNIT iValue = 0;
    UNIT iRet = 0;

    printf("Enter number :\n");
    scanf("%d",&iValue);

    printf("Enter the bit position :\n");
    scanf("%d",&iLocation);

    iRet = ToggleBit(iValue,iLocation);

    printf("Updated number : %d\n",iRet);
    
    return 0;
}