
/* Accept one character from user and convert case of that character.
Input : a Output : A
Input : D Output : d 
*/

import java.lang.*;
import java.util.*;

class Demo
{
	public void Display(char Ch)
	{
		
		if((Ch>='A') && (Ch<='Z'))
		{
			Ch=(char)(Ch+('a'-'A'));
			System.out.println(Ch);
		}
		else
		{
			Ch=(char)(Ch-('a'-'A'));
			System.out.println(Ch);
		}
						
	}
		
}

class Fourth_3
{
	public static void main(String args[])
	{
		Demo dobj=new Demo();
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the character");
		char ch=sobj.next().charAt(0);
		
		dobj.Display(ch);
	}
}