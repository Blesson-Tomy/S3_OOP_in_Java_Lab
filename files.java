import java.lang.*;
import java.io.*;
import java.util.*;

//This program reads from a file and enters it into another file.

public class files {
    public static void main(String args[]) throws FileNotFoundException
    {   
        try{
            FileInputStream fin = new FileInputStream("Sample.txt");
            FileOutputStream fout = new FileOutputStream("Sample1.txt");
            int a;
            char c;


            do{
                a=fin.read();
                c = (char)a;
                fout.write(c);

            }while(a!=-1);

            System.out.println("Mission Successful!");

           // FileReader fr = new FileReader("SAMPLE.txt");
        }
        catch(IOException e)
        {
            System.out.println("Error Caught Successfully!");
        }
      
    }
}
