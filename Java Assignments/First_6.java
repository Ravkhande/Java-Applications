
/* Write a program which accept number from user and display its digits in reverse
order.
Input : 2395
Output : 5
 9
 3
 2
Input : 1018
Output : 8
 1
 0
 1
Input : -1018
Output : 8
 1
 0
 1
Input : 9000
Output : 0
 0
 0
 9 
 
 */
 
 import java.lang.*;
 import java.io.*;
 
 class Demo
 {
	 public void Digits(int iNo)
	 {
		 if(iNo<0)
		 {
			 iNo=-iNo;
		 }
		 while(iNo!=0)
		 {
			 int iDigit=iNo%10;
			 System.out.println(iDigit);
			 iNo=iNo/10;
		 }
	 }
		 
 }
 
 class First_6
 {
	 public static void main(String args[]) throws Exception
	 {
		 InputStreamReader iobj=new InputStreamReader(System.in);
		 BufferedReader bobj=new BufferedReader(iobj);
		 
		 System.out.println("Enter the number");
		 int no=Integer.parseInt(bobj.readLine());
		 
		 Demo dobj=new Demo();
		 
		 dobj.Digits(no);
	 }
 }
		 
		 
		 
		 