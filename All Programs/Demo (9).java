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

class Pattern
{
	void Display(int iRow, int iCol)		// 10
	{
		if((iRow != iCol) || (iRow <=0) || (iCol <=0))
		{
			return;
		}
		int i = 0, j = 0, icnt = 1;
		char ch = 'A';

		System.out.println();
		
		for(i = 1; i<= iRow; i++)
		{
			for(j = 1; j<= iCol; j++)
			{
				if(i == j)	// Diagonal
				{
					System.out.print("&\t");
				}
				else if((i==1)||(j==1)||(i==iRow)||(j==iCol)) // Border
				{
					System.out.print("*\t");
				}
				else if(i>j) // lower traingle
				{
					System.out.print(ch+"\t");
					ch++;
				}
				else	// Upper triangle
				{
					System.out.print(icnt+"\t");
					icnt++;
				}
			}
			System.out.println();
		}
	}
}

class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter rows");
		int ivalue1 = sobj.nextInt();

		System.out.println("Enter columns");
		int ivalue2 = sobj.nextInt();

		Pattern pobj = new Pattern();
		pobj.Display(ivalue1,ivalue2);
	}
}

