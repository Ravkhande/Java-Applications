
/* Accept on character from user and check whether that character is vowel
(a,e,i,o,u) or not.
Input : E Output : TRUE
Input : d Output : FALSE 
*/


import java.lang.*;
import java.util.*;

class Demo
{
	public int Display(char Ch)
	{
		
		if((Ch=='A') || (Ch=='a') || (Ch=='E') || (Ch=='e') || (Ch=='I') || (Ch=='i') || (Ch=='O') || (Ch=='o') || (Ch=='U') || (Ch=='u'))
		{
			return 1;
			
		}
		else
		{
			return 0;
		}
						
	}
		
}

class Fifth_3
{
	public static void main(String args[])
	{
		Demo dobj=new Demo();
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the character");
		char ch=sobj.next().charAt(0);
	
		int iRes=dobj.Display(ch);
		if(iRes==1)
		{
			System.out.println("Character is Vowel");
		}
		else
		{
			System.out.println("Character is Not Vowel");
		}
	}
}