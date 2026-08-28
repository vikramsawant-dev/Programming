#include<stdio.h>
//ERROR due to
int main()
{
    int *Brr = NULL;
    int iLength = 0 , iCnt = 0;

    //step 1 : accept the number of element
    printf("Enter number of elements : \n");
    scanf("%d" ,&iLength);

    // step 2 : allocate the memory
    Brr =(int *)malloc(iLength * sizeof(int));

    //step 3: accept the value from user
    for(iCnt = 0; iCnt<iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    //step 4 : use the memory (LOGIC)

    //step 5 : Dellocate the memory
    free(Brr);


    return 0;
}