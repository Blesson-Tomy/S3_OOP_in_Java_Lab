import java.util.*;
import java.io.*;

class palindrome
{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = scan.nextLine().toLowerCase();
        char[] arr = new char[10];
        arr = s.toCharArray();
        int len = s.length();
        System.out.print("You entered: ");
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]);
        }
        int flag=0;
        for(int i=0;i<len;i++)
        {   int j=len-1-i;
            
                if(arr[i]!=arr[j])
                {
                    flag++;
                }
        }
        System.out.println("");
        if(flag==0)
        {
            System.out.println(" The String is Palindrome");
        }
        else{
            System.out.println("The string is not Palindrome");
        }
    }
}
