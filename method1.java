import java.util.Scanner;

class getTotal
{
    void sum(int a, int b)
    {   int sum;
        sum=a+b;
        System.out.println(""+sum);
    }
}



public class method1 {
    int a,b,sum;
    public static void main(String args[])
    {
        System.out.println("Enter the numbers:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        getTotal d=new getTotal();
        d.sum(a,b);
    }
}
