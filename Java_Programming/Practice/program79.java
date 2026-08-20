class Logic
{
    void findMin(int a, int b, int c)
    {
        int min = a;
        if(b < min)
        {
            min = b;
        }
        if(c < min)
        {
            min = c;
        }
        System.out.println("Minimum number is :"+min);
    }
}

class program79
{
    public static void main (String A[])
    {
        Logic lobj = new Logic();
        lobj.findMin(3,7,2);
    }
}