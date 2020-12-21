
import java.lang.*;
import java.util.*;

class Sum
{
	public int Add(int brr[],int N)
	{
		int isum=0;
	   for(int i=0;i<N;i++)
	   {
		   isum=isum+brr[i];
	   }
	   return isum;
	}
	   
	   
}	   

class SumOfNx
{
   public static void main(String brr[])
   {
	   int iValue=0,iRet=0;
	   Scanner sobj=new Scanner(System.in);
	   
	   System.out.println("enter the N number");
	   iValue=sobj.nextInt();
	   
	   if(iValue<0)     //updator
	   {
		   iValue=-iValue;
	   }
	   int arr[]=new int[iValue];
	   
	   Sum obj=new Sum();
	   
	    System.out.println("entered N numbers are:");
	   
	   for(int i=0;i<iValue;i++)
	   {
		   arr[i]=sobj.nextInt();
	   }
	   
	   iRet=obj.Add(arr,iValue);
	   	   System.out.println("Addition of N numbers are:"+ iRet);
   }
}