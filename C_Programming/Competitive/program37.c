#include<stdio.h>

double CircleArea( float fHeight, float fWidth)
{
    float Area = 0;

    Area = fWidth * fHeight;

    return Area;
    
}
int main()
{
    float fValue1 = 0.0f;
    float fValue2 = 0.0f;
    double dRet = 0.0f;

    printf("Enter width :\n");
    scanf("%f",&fValue1);

    printf("Enter height :\n");
    scanf("%f",&fValue2);

    dRet = CircleArea(fValue1,fValue2);
    printf("%f",dRet);

    return 0;
}