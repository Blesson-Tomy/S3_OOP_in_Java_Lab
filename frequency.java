<<<<<<< HEAD

    
 import java.util.Scanner;
=======
package lab3;

import java.util.Scanner;
>>>>>>> 74d25b5e1d6c13922d1c7a43214c71a5b997dcd3

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
<<<<<<< HEAD
			if(s2==s1.charAt(i))
=======
			//if(s2==s1.charAt(i))
			if(s2.equalsIgnoreCase(s1.charAt[i])==0)
>>>>>>> 74d25b5e1d6c13922d1c7a43214c71a5b997dcd3
			{
				count++;
			}
		}
		System.out.println("There are "+count+" repetitions.");
		
	}

}
<<<<<<< HEAD

=======
>>>>>>> 74d25b5e1d6c13922d1c7a43214c71a5b997dcd3
