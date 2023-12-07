import java.util.Random;
import java.io.*;
class Rand extends Thread
{
    public void run()
    {
        Random ran = new Random();
        for(int i=0;i<5;i++)
        {
            int num =ran.nextInt(10);
            if(num%2==0)
            {
                new oddthread(num).start();
            }
            else
            {
                new eventhread(num).start();
            }
        }
    }   
}

class oddthread extends Thread
{   private int num;
    oddthread(int num)
    {
        this.num=num;
    }
    public void run()
    {   
        int ans = num*num*num;
        System.out.println("Cube of the Number is :"+ans);
    }

}

class eventhread extends Thread
{
    private int num;
    eventhread(int num)
    {
        this.num=num;
    }

    public void run()
    {
        int ans = num*num;
        System.out.println("Square of the Number is :"+ans);
    }
}


public class multhread 
{
    public static void main(String[] args) 
    {
        Rand r = new Rand();
        r.start();
    }
}
