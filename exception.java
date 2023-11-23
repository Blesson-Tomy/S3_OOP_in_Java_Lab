import java.util.Scanner;

public class exception {

	public static void main(String args[]) 
	{
			
			Scanner obj = new Scanner(System.in);
			int n;
		
		do {
			System.out.println("Enter the Operation: \n 1:Arithmetic Error \n 2:ArrayOutOfBoundsError \n 3:Exit");
			n =obj.nextInt();
			
				switch(n)
				{
				case 1:
					Arithmetic();
					
					break;
					
				case 2:
					Array();
					
					break;
					
				case 3:
					System.out.println("Successfully excited!");
					break;
				}
			}while(n!=3);
		}

	private static void Arithmetic() 
	{
		try 
		{ Scanner hi = new Scanner(System.in);
		System.out.println("Enter the two numbers:");
			int a= hi.nextInt();
			int b= hi.nextInt();
			int c=a/b;
			System.out.println("Ans is:"+c);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Error has been caught!");
		}
		
		finally
		{
			System.out.println("Final block has been printed!");
		}
	}
	private static void Array() 
	{
			try 
			{	
				Scanner hi = new Scanner(System.in);
				System.out.println("Enter the size of the array:");
				int a= hi.nextInt();
				int arr[]=new int[a];
				for(int i=0;i<a;i++)
				{
					System.out.println("Enter the elements:");
					arr[i] = hi.nextInt();
				}
				
				System.out.println("Enter the position to be printed:");
				int pos = hi.nextInt();
				System.out.println("The position is: "+arr[pos]);
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array Error has been caught!");
			}
			
			finally
			{
				System.out.println("Final block has been printed!");	
			}
	}
}

