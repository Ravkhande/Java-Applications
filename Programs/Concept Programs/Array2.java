
import java.lang.*;
import java.util.*;

class Array2
{
	public static void main(String brr[])
	{
		int iRow=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number of row");
         iRow=sobj.nextInt();       //4
		 
		int arr[][]=new int[iRow][]; 
		
		
		for(int i=0;i<arr.length;i++)
		{
			int iCol=sobj.nextInt();
			System.out.println("Enter the number of columns");
			arr[i]=new int[iCol];     //arr[0]=new int[4/5/6];
		
		    for(int j=0;j<iCol;j++)
			{
				arr[i][j]=sobj.nextInt();
				System.out.println("Entered elements are"+ arr[i][j]);		
		}
		}
		
		
	}
}

			