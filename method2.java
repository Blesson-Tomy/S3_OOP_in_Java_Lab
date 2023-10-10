

class Display
{
    void Area(int sq)
    {   double area;
        area=sq * sq;
        System.out.println(""+area);
    }
    void Area(int b, int l )
     {   double area;
        area=b*l;
        System.out.println(""+area);
    }
    void Area(double c)
     {   double area;
        area=c * 3.142;
        System.out.println(""+area);
    }

}

public class method2 
{
    int a,b,sum;
    public static void main(String args[])
    {
        Display d =new Display();
        d.Area(10);
        d.Area(40,20);
        d.Area(12.00);


    }
}
