
/* 
Write Java program which accept number of rows and number of
columns from user and display below pattern.
Input : iRow = 4 iCol = 3
Output : 
 * * *
 * * *
 * * *
 * * * 
 
 */
 
import java.lang.*;
import java.util.*;

class Pattern
{
 public void pattern(int iRow, int iCol)
 {
     
	 
	 if(iRow<=0 || iCol<=0)
	 {
		 return;
	 }
	 
	 System.out.println();
	 for(int i=0;i<iRow;i++)
	 {
		 for(int j=0;j<iCol;j++)
		 {
			 System.out.print("*\t");
		 }
		 System.out.println();
	 }
		 
 }
} 


class Display7
{
	public static void main(String args[])
	{
		Pattern pobj=new Pattern();
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the rows");
		int value1=sobj.nextInt();
		
		System.out.println("Enter the columns");
		int value2=sobj.nextInt();
		
		pobj.pattern(value1,value2);
		
	}
}
