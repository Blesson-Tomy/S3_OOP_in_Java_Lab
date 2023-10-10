
    
 import java.util.Scanner;

public class frequency {

	public static void main(String[] args) {
		
		int i;
		Scanner arr = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1 = arr.nextLine();
		
		System.out.println("Enter the character to check the frequency of:");
		char s2 = arr.next().charAt(0);
		
		char[] ch = s1.toCharArray();
		int x = s1.length();
		int count=0;
		
		for(i=0;i<x;i++)
		{
			if(s2==s1.charAt(i))
			{
				count++;
			}
		}
		System.out.println("There are "+count+" repetitions.");
		
	}

}

