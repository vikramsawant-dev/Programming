#include <stdio.h>
#include <stdlib.h>

int Product(int Arr[] , int iLength)
{
    int iCnt = 0;
    int iProduct = -1;
    int iFlag = 0;
    
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] % 2 != 0)
        {
            iProduct = iProduct * Arr[iCnt];
            iFlag = 1;
        }
    }
    if(iFlag == 0)
    {
        return 0;
    }
    return iProduct;
}
int main()
{
    int iSize = 0;
    int iCnt = 0;
    int *p = NULL;
    int iRet = 0;
   
    printf("Enter the number of elements : \n");
    scanf("%d",&iSize);

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }
    printf("Enter %d elements\n",iSize);
    
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter elements : %d\n",iCnt+1);
        scanf("%d",&p[iCnt]);
    }
    iRet = Product(p, iSize);

    printf("Product is %d",iRet);

    free(p);
    
    return 0;
}