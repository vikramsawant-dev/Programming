class Logic
{
    void DisplayGrade(int marks)
    {
        if(marks <= 100 && marks >= 91)
        {
            System.out.println("Grade is A");
        }
        else if(marks <= 90 && marks >= 81)
        {
            System.out.println("Grade is B");
        }
        else if(marks <= 80 && marks >= 71)
        {
            System.out.println("Grade is C");
        }
        else if(marks <= 70 && marks >= 61)
        {
            System.out.println("Grade is D");
        }
        else
        {
            System.out.println("Grade is F");
        }
    }
}

public class program87
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.DisplayGrade(82);
    }
}
