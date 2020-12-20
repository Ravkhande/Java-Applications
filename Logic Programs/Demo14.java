
//Accept string from user and return the difference between the frequency of capital characters and small characters
/*

input: "Hello INdiA"
outpit: 1(6-5)

*/
// in java in string there is no '\0'

import java.lang.*;
import java.util.*;

class StringDemo
{
	int Frequency(String str)
	{
		// toCharArray method is used to convert the string into character array
		char arr[]=str.toCharArray();
		
		int capcount=0,smcount=0;
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>='A' && arr[i]<='Z')
			{
				capcount++;
			}
			else if(arr[i]>='a' && arr[i]<='z')
			{
				smcount++;
			}
		}
		
		return(capcount-smcount);
		
	}
	
}

class Demo14
{
	public static void main(String args[])
	{
		StringDemo dobj=new StringDemo();
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sobj.nextLine();
		
	     int iRes=dobj.Frequency(str);
          System.out.println("Difference between the frequency is  :"+iRes);
		 
	}
}

		


