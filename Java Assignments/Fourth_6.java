
/* Write a program which accept number from user and count frequency of 4 in it.
Input : 2395
Output : 0
Input : 1018
Output : 0
Input : 9440
Output : 2
Input : 922432
Output : 1 
*/

import java.lang.*;
import java.io.*;
 
 class Demo
 {
	 public int CountFour(int iNo)
	 {
		 int iCnt=0;
		 int iDigit=0;
		 
		 if(iNo<0)
		 {
			 iNo=-iNo;
		 }
		 while(iNo!=0)
		 {
			 iDigit=iNo%10;
			 if(iDigit==4)
			 {
				iCnt++;
			 }
			 iNo=iNo/10;
		 }
		 
		 return iCnt;
		 
		 
	 }
		 
 }
 
 class Fourth_6
 {
	 public static void main(String args[]) throws Exception
	 {
		 InputStreamReader iobj=new InputStreamReader(System.in);
		 BufferedReader bobj=new BufferedReader(iobj);
		 
		 System.out.println("Enter the number");
		 int no=Integer.parseInt(bobj.readLine());
		 
		 Demo dobj=new Demo();
		 
		 int iRes=dobj.CountFour(no);
			System.out.println("Frequency of 4 is:\t"+iRes);
		
	 }
 }
		 
		 
		 
		 