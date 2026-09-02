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
    //Static memory allocation for object
    //ArrayX aobj1(5);

    ArrayX *aobj1 = new ArrayX(5);

    delete aobj1;
    cout<<"Ende of main\n";

    return 0;
}