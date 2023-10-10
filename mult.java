package lab3;
import java.util.Scanner;
public class Mult {

	public static void main(String[] args) {
		int i, j;
		Scanner arr = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of Matrix 1");
		
		int row1 = arr.nextInt();
		int col1 = arr.nextInt();
		
		System.out.println("Enter the number of rows and columns of Matrix 2");
		
		//int row2 = arr.nextInt();
		//int col2 = arr.nextInt();
		
		//System.out.println("The number of rows is "+row +" and columns is "+col);
		
		int array1[][]= new int[row1][col1];
		int array2[][]= new int[row1][col1];
		int sum[][]= new int[row1][col1];
		
		
		System.out.println("Enter the elements of Array 1:");
	for(i=0;i<row1;i++)
	{
		for(j=0;j<col1;j++)
		{
			array1[i][j] = arr.nextInt();	
		}
	}
	
		System.out.println("Enter the elements of Array 2:");
	for(i=0;i<row1;i++)
	{
		for(j=0;j<col1;j++)
		{
			array2[i][j] = arr.nextInt();	
		}
	}
	
	int k;
	//Matrix Multiplication happens here//
	for(i=0;i<row1;i++)
	{
		for(j=0;j<col1;j++)
		{sum[i][j]=0;
			for (k=0;k<row1;k++)
			{
			sum[i][j] = sum[i][j] + array1[i][k] * 	array2[k][j];
		}
	}}
	
	
	
	for(i=0;i<row1;i++)
	{	System.out.println("\n");
		for(j=0;j<col1;j++)
		{
		System.out.print(sum[i][j]);
		System.out.print("");
		}
	}
	}
}

	