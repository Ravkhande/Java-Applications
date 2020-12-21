
/* Write java program which accept N numbers from user and return
product of all odd elements.
Input : N : 6
 Elements : 15 66 3 70 10 88 
 Output : 45
 
Input : N : 6
 Elements : 44 66 72 70 10 88
Output : 0 
*/

import java.lang.*;
import java.util.*;

class Number
{
 public int Product(int Arr[])
 {
	 int iMul=1,i;
     for(i=0;i<Arr.length;i++)
	 {
          if((Arr[i]%2)!=0)
		  {
	
             	iMul=iMul*(Arr[i]);
		  }
	          
	 }
	 
	
     return iMul;
 }
} 

class RetProd
{
	public static void main(String args[])
	{
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

		int iRes=nobj.Product(arr);
		if(iRes==1)
		{
			System.out.println("product of all odd elements:\t"+0);
		}
		else
		{
		System.out.println("product of all odd elements:\t"+iRes);
		}
			
	}
}


