
/* 
// Write a program which displays below pattern
// Input : 6	6	
/*

	&	*	*	*	*	*
	*	&	1	2	3	*
	*	A	&	4	5	*
	*	B	C	&	6	*
	*	D	E	F	&	*
	*	*	*	*	*	&
	
	11	12	13	14	15	16
	21	22	23	24	25	26
	31	32	33	34	35	36
	41	42	43	44	45	46
	51	52	53	54	55	56
	61	62	63	64	65	66

	i j
	3 2
	4 2
	4 3
	5 2
	5 3
	5 4

*/

import java.lang.*;
import java.util.*;

class Demo
{
	public void pattern(int iRow,int iCol)
	{
		if(iRow!=iCol)
		{
			return;
		}
		if(iRow<=0 || iCol<=0)
		{
			return;
		}
		
		int i=0,j=0,iCnt=1;
		char ch='A';
		System.out.println();
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if(i==j)       // for Diagonal
				{
					System.out.print("&\t");
				}
				else if(i==1 || j==1 || i==iRow || j==iCol)         // for border
				{
					System.out.print("*\t");
				}
				else if(i>j)        // for lower triangle
				{
					System.out.print(ch+"\t");
					ch++;
				}
				else if(j>i)
				{
					System.out.print(iCnt+"\t");
					iCnt++;
				}
					
			}
			System.out.println();
			
		}
		
		
	}
	
}

class Print
{
	public static void main(String args[])
	{
		Demo dobj=new Demo();
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the rows");
		int value1=sobj.nextInt();
		
		System.out.println("Enter the columns");
		int value2=sobj.nextInt();
		
	    dobj.pattern(value1,value2);
		
	}
}

		
