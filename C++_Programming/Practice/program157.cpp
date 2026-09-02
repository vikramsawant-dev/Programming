#include<iostream>
using namespace std;

#pragma pack(1)
class ArrayX
{
    public:
        int*Arr = 0;
        int iSize;

        //Default constructor
        ArrayX()
        {

        }
        //Parameterized constructor
        ArrayX(int X)
        {

        }
};

int main()
{
    ArrayX aobj1;    //Default
    ArrayX aobj2(5);  //Parameterized

    cout<<sizeof(aobj1)<<endl;  //12 or 8 bytes
    return 0;
}