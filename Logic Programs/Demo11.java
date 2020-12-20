
// Write a program which displays below pattern
//
// Input: 6    6
/*   


          & * * 

*/


import java.lang.*;
import java.util.*;

class Display
{
	void Pattern(int iRow,int iCol)
	{
		if((iRow!=iCol)  || (iRow<=0) || (iCol<=0))
		{
			return;
		}
		int iCnt=1;
		char ch='A';
		
		System.out.println();
		for(int i=1;i<=iRow;i++)
		{
			for(int j=1;j<=iCol;j++)
			{
				if(i==j)       //Diagonal
				{
					System.out.print("&\t");
				}
				else if((i==1)||(j==1)||(i==iRow)||(j==iCol))      // Border
				{
					System.out.print("*\t");
				}
				else if(i>j) // lower triangle
				{
					System.out.print(ch+"\t");
					ch++;
					
				}
				else     // upper triangle
				{
					System.out.print(iCnt+"\t");
					iCnt++;
					
				}
				
			}
			System.out.println();
			
		}
		
	}
	
}

class Demo11
{
	public static void main(String arr[])
	{
		Display dobj=new Display();
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter rows");
		int value1=sobj.nextInt();
		
		System.out.println("Enter columns");
		int value2=sobj.nextInt();
	     dobj.Pattern(value1,value2);
		
	}
}
	
