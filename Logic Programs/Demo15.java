// Accept string from user and calculate number of words
// Input : "HeLLo _ INdiA"
// Output : 2
// Input : "_ _India_Demo"
// Output : 2
// Input : "_ _ __India _ _ _ Demo _ _"
// Output : 2
// Input : "_ _a _ _ b _ _"
// Output : 2

// in java in string there is no '\0'

import java.lang.*;
import java.util.*;

class StringDemo
{
	int WordFrequency(String str)
	{
		// toCharArray method is used to convert the string into character array
		char arr[]=str.toCharArray();
		int size=arr.length;
		int i=0,iCnt=0;
		
		while(i<size)
		{
			if(arr[i]==' ')
			{
				while((i<size) && (arr[i]==' '))          // skip all spaces
				{
					i++;
				}
			}
			else if((arr[i]!=' ') && (i<size))
			{
				iCnt++;
				while((i<size) && (arr[i]!=' '))       //skip all non space character
				{
					i++;
				}
			}
				
		}
		
		return iCnt;
		
	}
	
}

class Demo15
{
	public static void main(String args[])
	{
		StringDemo dobj=new StringDemo();
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sobj.nextLine();
		
	     int iRes=dobj.WordFrequency(str);
          System.out.println("Total number of words are :"+iRes);
		 
	}
}

		


