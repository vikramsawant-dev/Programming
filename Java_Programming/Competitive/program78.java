class Logic
{
    void findMax(int a, int b)
    {
        if(a < b)
        {
            System.out.println("Maximum number is :"+b);
        }
        else
        {
            System.out.println("Maximum number is :"+a);
        }
    }
}

class program78
{
    public static void main (String A[])
    {
        Logic lobj = new Logic();
        lobj.findMax(20,15);
    }
}