import java.lang.*;
import java.util.*;

class SumOfN
{
   public static void main(String brr[])
   {
	   int iValue=0,isum=0;
	   Scanner sobj=new Scanner(System.in);
	   
	   System.out.println("enter the N number");
	   iValue=sobj.nextInt();
	   
	   int arr[]=new int[iValue];
	   
	    System.out.println("entered N numbers are:");
	   for(int i=0;i<iValue;i++)
	   {
		   arr[i]=sobj.nextInt();
		   isum=isum+arr[i];
	   }
	   
	   	   System.out.println("Addition of N numbers are:"+ isum);
   }
}
	   
	  
	   
	   