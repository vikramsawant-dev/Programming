#include<iostream>
using namespace std;

#pragma pack(1)
class ArrayX
{
    public:
        int*Arr = 0;
        int iSize;
};

int main()
{
    ArrayX aobj;

    cout<<sizeof(aobj)<<endl;  //16 or 8 bytes
    return 0;
}