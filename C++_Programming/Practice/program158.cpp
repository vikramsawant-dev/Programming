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
            cout<<"Inside Constructor\n";

            iSize = X;              //Charateristics initilization
            Arr = new int[iSize];   //Resource allocation

        }
        //Destructor/
        ~ArrayX()
        {
            cout<<"Inside Distructour\n";
            delete []Arr;       //Resource deallocation
        }
};

int main()
{
    ArrayX aobj1(5);

    cout<<sizeof(aobj1)<<endl;  //12 or 8 bytes
    return 0;
}