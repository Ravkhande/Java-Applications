/*
Input- Thhiss is SString
Output- T$i$ is $tring
Consecutive letter replace by single $
*/

import java.lang.*;
import java.util.*;

class Demo
{
	public static void main(String arg[])
	{
		try
		{
			Scanner sobj = new Scanner(System.in);

			System.out.println("Enter string");
			String str = sobj.nextLine();

			MyString mobj = new MyString();

		 	String outstr = mobj.AxisFunction(str);

		 	System.out.println("Modified string is : "+outstr);		 	
		}
		catch(Exception obj)
		{}
	}
}

class MyString
{
	String AxisFunction(String str) throws Exception
	{
		char arr[] = str.toCharArray();
		char brr[] = new char[arr.length];

		int j = 0, i = 0;
		
		// "H	e 	l 	l 	o"

		for(i = 0; i < arr.length-1; i++)
		{
			if(arr[i] == arr[i+1])
			{
				brr[j] = '$';
				i++;
			}
			else
			{
				brr[j] = arr[i];
			}
			j++;
		}

		brr[j] = arr[i];
		String temp = new String(brr);

		return temp;
	}
}
































