// Accept string from user and calculate number of words
// Input : "HeLLo _ INdiA"
// Output : 2
// Input : "_ _India_Demo"
// Output : 2
// Input : "_ _ __India _ _ _ Demo _ _"
// Output : 2
// Input : "_ _a _ _ b _ _"
// Output : 2

import java.lang.*;
import java.util.*;

class DemoString
{
	int WordFrequency(String str)
	{
		char arr[] = str.toCharArray();
		int size = arr.length;
		int i = 0, iCnt= 0;;

		while(i < size)
		{
			if(arr[i] == " ") // Space occurs
			{
				while((i < size) && (arr[i] == " "))	// Skip all white spaces
				{
					i++;
				}
			}
			else if((i < size) && (arr[i] != " "))// non space charcter
			{
				iCnt++;
				while((arr[i] != " ") && (i < size))
				{
					i++;
				}
			}
		}
		return iCnt;
	}
}
class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");

		String str = sobj.nextLine();
		DemoString dobj = new DemoString();

		int ret = dobj.WordFrequency(str);
		System.out.println("Total no of words are :"+ret);
	}
}



























/*
int StrFrequency(char str[])
{
	int CapCount = 0, SmCount = 0;

	while(*str != '\0')
	{
		if((*str >= 'A') && (*str <= 'Z'))
		{
				CapCount++;
		}
		else if((*str >= 'a') && (*str <= 'z'))
		{
			SmCount++;
		}
		str++;
	}
	return (CapCount - SmCount);
}

int StrFrequency(char str[])
{
	int CapCount = 0, SmCount = 0;
	int i = 0;

	for(i = 0;str[i] != '\0'; i++)
	{
		if((str[i] >= 'A') && (str[i] <= 'Z')
		{
				CapCount++;
		}
		else if((str[i] >= 'a') && (str[i] <= 'z'))
		{
			SmCount++;
		}
	}
	return (CapCount - SmCount);
}

*/