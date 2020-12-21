import Marvellous.MarvellousArray;
import java.lang.*;
import java.util.*;

class Searching extends MarvellousArray	// inheritance
{	
	public Searching(int size)
	{
		super(size);	// call the constructor of parent class
	}
	public boolean LinearSearch(int no)
	{
		int i = 0;
		boolean flag = false;
		for(i = 0; i < arr.length; i++)
		{
			if(arr[i] == no)
			{
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean LinearSearchBI(int no)
	{
		int start = 0, end = 0;
		boolean flag = false;

		for(start = 0 , end = arr.length-1; start <= end; start++,end--)
		{
			if((arr[start] == no) || (arr[end] == no))
			{
				flag = true;
				break;
			}
		}

		return flag;
	}

	public boolean CheckSorted()
	{
		int i = 0;
		boolean flag = true;

		for(i = 0; i < arr.length-1; i++)
		{
			if(arr[i] > arr[i+1])
			{
				flag = false;
				break;
			}
		}
		return flag;
	}

	public boolean BibnarySearch(int no)
	{
		int start = 0, end = 0, middle = 0;
		boolean flag = false;
		end = arr.length-1;
		boolean bret = false;

		bret = CheckSorted();
		if(bret == false)
		{
			System.out.println("Array is not sorted");
			return false;
		}

		while(start <= end)
		{
			middle = (start + end)/2;
			if((arr[middle] == no) || (arr[start] == no) || (arr[end] == no))
			{
				flag = true;
				break;
			}
			if(no > arr[middle])
			{
				start = middle + 1;
			}
			if(no < arr[middle])
			{
				end = middle - 1;
			}
		}
		return flag;
	}
}

class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter size");

		int size = sobj.nextInt();

		Searching obj = new Searching(size);

		obj.Accept();
		obj.Display();

		System.out.println("Enter the element to search");
		int value = sobj.nextInt();

		boolean bret = obj.BibnarySearch(value);
		if(bret == true)
		{
			System.out.println("Element is there in the array");
		}
		else
		{
			System.out.println("There is no such element");
		}
	}
}



/*
	Class 
	Constructor
	Inheritance
	super keyword
	Package
	import statement
	custom package
*/











































