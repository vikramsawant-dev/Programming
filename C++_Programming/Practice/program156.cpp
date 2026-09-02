#include<iostream>
using namespace std;

#pragma pack(1)
class ArrayX
{
    public:
        int*Arr = 0;
        int iSize;

        ArrayX(int X)
        {

        }
};

int main()
{
    ArrayX aobj(5);  

    cout<<sizeof(aobj)<<endl;  //12 or 8 bytes
    return 0;
}