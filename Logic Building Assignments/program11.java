
/* Write java program which accept N numbers from user and accept
one another number as NO , check whether NO is present or not.

Input : N : 6
 NO: 66
 Elements : 85 66 3 66 93 88
Output : TRUE

Input : N : 6
 NO: 12
 Elements : 85 11 3 15 11 111
Output : FALSE
*/

import java.lang.*;
import java.util.*;

class Number
{
 boolean Check(int Arr[], int iNo)
 {
	 int i;
    for(i=0;i<Arr.length-1;i++)
	{
		if(Arr[i]==iNo)
		{
			break;
		}
	}
	
	if(Arr[i]==iNo)
	{
		return true;
	}
	else
	{
	return false;
	}
	
 }

} 

class First
{
	public static void main(String args[])
	{
		boolean bRet=false;
		Number nobj=new Number();
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the N value");
		int N=sobj.nextInt();
		
		int arr[]=new int[N];
		
		System.out.println("Enter the N elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.nextInt();
		}
		
		System.out.println("Enter one another number as NO:");
		int NO=sobj.nextInt();
		
		bRet=nobj.Check(arr,NO);
		if(bRet==true)
		{
			System.out.println("Number NO is present");
		}
		else
		{
			System.out.println("Number NO is not present");
		}
	}
}
		
