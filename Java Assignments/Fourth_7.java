
/* Write a program which accept number from user and return multiplication of all
digits.
Input : 2395
Output : 270
Input : 1018
Output : 8
Input : 9440
Output : 144
Input : 922432
Output : 864 
*/

import java.lang.*;
import java.io.*;
 
 class Demo
 {
	 public static int iMul;
	     static
		 {
			 iMul=1;
		 }
	 public int MulDigits(int iNo)
	 {
		 if(iNo<0)
		 {
			 iNo=-iNo;
		 }
		 if(iNo!=0)
		 {
			 int iDigit=iNo%10;
			 if(iDigit==0)
			 {
				 iDigit=1;
			 }
			 iMul=iMul*iDigit;
			 iNo=iNo/10;
			 MulDigits(iNo);
		 }
		 return iMul;
	 }
		 
 }
 
 class Fourth_7
 {
	 public static void main(String args[]) throws Exception
	 {
		 InputStreamReader iobj=new InputStreamReader(System.in);
		 BufferedReader bobj=new BufferedReader(iobj);
		 
		 System.out.println("Enter the number");
		 int no=Integer.parseInt(bobj.readLine());
		 
		 Demo dobj=new Demo();
		 
		 int iRes=dobj.MulDigits(no);
		 System.out.println("multiplication of all digits is:\t"+iRes);
	 }
 }