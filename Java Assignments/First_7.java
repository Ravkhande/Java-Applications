
/* Write a program which accept number from user and return the count of even
digits.
Input : 2395
Output : 1
Input : 1018
Output : 2
Input : -1018
Output : 2
Input : 8462
Output : 4 
*/


import java.lang.*;
import java.io.*;
 
 class Demo
 {
	 public int CountEven(int iNo)
	 {
		 int iCnt=0;
		 if(iNo<0)
		 {
			 iNo=-iNo;
		 }
		 while(iNo!=0)
		 {
			 int iDigit=iNo%10;
			 if((iDigit)%2==0)
			 {
				 iCnt++;
			 }
			 iNo=iNo/10;
		 }
		 
		 return iCnt;
	 }
		 
 }
 
 class First_7
 {
	 public static void main(String args[]) throws Exception
	 {
		 InputStreamReader iobj=new InputStreamReader(System.in);
		 BufferedReader bobj=new BufferedReader(iobj);
		 
		 System.out.println("Enter the number");
		 int no=Integer.parseInt(bobj.readLine());
		 
		 Demo dobj=new Demo();
		 
		 int iRes=dobj.CountEven(no);
		 System.out.println("Count of Even digits are:\t"+iRes);
	 }
 }
		 
		 
		 
		 