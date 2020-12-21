
/* Write a program which accept number from user and count frequency of such a
digits which are less than 6.
Input : 2395
Output : 3 
*/

import java.lang.*;
import java.io.*;
 
 class Demo
 {
	 public int Count(int iNo)
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
			 if(iDigit<6)
			 {
				iCnt++;
			 }
			 iNo=iNo/10;
		 }
		 
		 return iCnt;
		 
		 
	 }
		 
 }
 
 class Fifth_6
 {
	 public static void main(String args[]) throws Exception
	 {
		 InputStreamReader iobj=new InputStreamReader(System.in);
		 BufferedReader bobj=new BufferedReader(iobj);
		 
		 System.out.println("Enter the number");
		 int no=Integer.parseInt(bobj.readLine());
		 
		 Demo dobj=new Demo();
		 
		 int iRes=dobj.Count(no);
			System.out.println("Frequency of digits which are less than 6 is:\t"+iRes);
		
	 }
 }
		 
		 
		 
		 