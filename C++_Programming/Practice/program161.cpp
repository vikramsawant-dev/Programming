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

            iSize = X;              
            Arr = new int[iSize];   

        }
        ~ArrayX()
        {
            cout<<"Inside Distructour\n";

            delete []Arr;      
        }
};

int main()
{

    ArrayX *aobj1 = new ArrayX(5);

    //Logic (Functional call)

    delete aobj1;

    return 0;
}