#include <stdio.h>

typedef unsigned int UNIT;

//Position : 4
UNIT OffBit(UNIT iNo, UNIT iPos)
{
    UNIT iMask = 0xFFFFFFF7;
    UNIT iResult = 0;

    if(iPos < 1 || iPos > 32)
    {
        printf("Invalid bit position\n");
        return iNo;
    }

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

    iRet = OffBit(iValue,iLocation);

    printf("Updated number is : %d\n",iRet);
    
    return 0;
}