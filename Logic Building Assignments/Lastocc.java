
/* Write java program which accept N numbers from user and accept
one another number as NO , return index of last occurrence of that NO.

Input : N : 6
 NO: 66
 Elements : 85 66 3 66 93 88
Output : 3
Input : N : 6
 NO: 93
 Elements : 85 66 3 66 93 88
Output : 4
Input : N : 6
 NO: 12
 Elements : 85 11 3 15 11 111
Output : -1 
*/

import java.lang.*;
import java.util.*;

class Number
{
 public int LastOcc(int Arr[], int iNo)
 {
	 int iCnt=0,iPos=-1;
   for(int i=0;i<Arr.length;i++)
   {
	   if(Arr[i]==iNo)
	   {
		   iPos=iCnt;
	   }
	   iCnt++;
   }
   
	return iPos;	   
 } 

} 

class Lastocc
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
		
		System.out.println("Enter one another number as NO:");
		int NO=sobj.nextInt();
		
		int iRet=nobj.LastOcc(arr,NO);
		System.out.println("Index of last occurrence of that NO is :\t"+iRet);
		
		
	}
}
		
