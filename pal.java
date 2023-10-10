package lab3;
import java.util.Scanner;

public class pal {

	public static void main(String[] args) {
		int i;
		Scanner arr = new Scanner(System.in);
			System.out.println("Enter the String:");

			String s1 = arr.nextLine();
			
			
			char[] ch = s1.toCharArray();
			int x = s1.length();
			
			String y =""; 
			
			for (i=x-1;i>=0;i--)
			{
				y = y+s1.charAt(i);
				
			}
			
			if (s1.equalsIgnoreCase(y))
			{
				System.out.println("It is a Palindrome.");
			}
			
			else
			{
				System.out.println("It is not a Palindrome.");
			}

	}

}
