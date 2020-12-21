// accept two strings from user and check whether the second styring is the 
// rotation of first string or not

// Input : 
//First :  	H e l l o I n d i a W o r l d
// Second : I n d i a W o r l d H e l l o		

// Output : True

// first    a b c d e f g h i j 
// Second   g h i j a b c d e f

// Output : True

import java.lang.*;
import java.util.*;

class Demo
{
	public static void main(String arg[])
	{
		try
		{
			Scanner sobj = new Scanner(System.in);

			System.out.println("Enter first string");
			String str1 = sobj.nextLine();

			System.out.println("Enter second string");
			String str2 = sobj.nextLine();

			MyString mobj = new MyString();

			boolean bret = mobj.CheckRotation(str1,str2);
			
			if(bret == true)
			{
				System.out.println("Strings are in rotation");
			}
			else
			{
				System.out.println("Strings are not in rotation");
			}
		}
		catch(Exception obj)
		{}
	}
}

class MyString
{
	boolean CheckRotation(String str1, String str2) throws Exception
	{
		if(str1.length() != str2.length())
		{
			return false;
		}
		
		//First :  	H e l l o I n d i a W o r l d H e l l o I n d i a W o r l d
		// Second : I n d i a W o r l d H e l l o

		// Step 1
		String str3 = str1 + str1;

		if(str3.contains(str2))
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
}






