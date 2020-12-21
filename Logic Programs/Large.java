
import java.lang.*;
import java.util.*;

class Large
{
	public static void main(String drr[])
	{
		int N, max=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the N number");
		N=sobj.nextInt();
		
		int arr[]=new int[N];
		
		
		System.out.println("Enter all elements into array");
		
		for(int i=0;i<N;i++)
		{
			arr[i]=sobj.nextInt();
			
		}
		max=arr[0];
		
		for(int i=0;i<N;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
		System.out.println("Largest number are"+ max);
	}
}
