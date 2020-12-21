
import java.lang.*;
import java.util.*;

class Average
{
	public static void main(String drr[])
	{
		int N;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the N number");
		N=sobj.nextInt();
		
		int arr[]=new int[N];
		

		int iSum=0;
		
		System.out.println("Enter all elements into array");
		
		for(int i=0;i<N;i++)
		{
			arr[i]=sobj.nextInt();
			iSum=iSum+arr[i];
		}
		
		int iret=0;
		iret=iSum/N;
		
		System.out.println("Average of array elements are"+iret);
		
	}
}
