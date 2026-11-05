#include <stdio.h>

typedef unsigned int UNIT;
int main()
{
    //largest value of int
    UNIT iMask = 0xFFFFFFFF;
    printf("%u \t %X \n",iMask,iMask);
    

    return 0;
}