#include<iostream>
using namespace std;

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