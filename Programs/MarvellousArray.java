package Marvellous;

import java.lang.*;
import java.util.*;


public class MarvellousArray
{
	public int arr[];        // Reference of array

	public MarvellousArray(int size)    //parameterized constructor
	{
		arr=new int[size];
	}

	public void Accept()         // Behaviour
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the elements :");

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.nextInt();
		}
	}

	public void Display()      // Behaviour
	{
		System.out.println("Entered Elements are :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	
	}
}


