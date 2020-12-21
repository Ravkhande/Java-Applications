import java.lang.*;
import java.util.*;

class MarvellousArray
{
	public int arr[];					// Characteristics

	public MarvellousArray(int size)	// Parametrised constructor
	{
		arr = new int[size];			// Dynamic memory allocation
	}

	public void Accept()				// Behaviour
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the elements");

		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sobj.nextInt();
		}	
	}

	public void Display()				// Behaviour
	{
		System.out.println("Entered elements are");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();	
	}
}

class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int size = sobj.nextInt();

		MarvellousArray mobj = new MarvellousArray(size);

		mobj.Accept();
		mobj.Display();
	}
}


