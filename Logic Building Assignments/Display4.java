
/*  Write Java program which accept number of rows and number of columns
from user and display below pattern.

Input : iRow = 3 iCol = 5
Output : 
 A A A A A
 B B B B B 
 C C C C C 
 
 
 */



import java.lang.*;
import java.util.*;

class Pattern
{
 public void pattern(int iRow, int iCol)
 {
     char ch='A';
	 
	 if(iRow<=0 || iCol<=0)
	 {
		 return;
	 }
	 
	 System.out.println();
	 for(int i=1;i<=iRow;i++)
	 {
			for(int j=1;j<=iCol;j++)
			{
				System.out.print(ch+"\t");
			}
			ch++;
			System.out.println();		
	}
	
 }
} 


class Display4
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
		
