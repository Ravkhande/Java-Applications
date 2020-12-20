
//Accept number from user and return its generic root
//input: 789
// output: 6        7+8+9 ->    24->    2+4    ->(6)
 // input: 9948
 // output :   9+9+4+8 ->30   ->  3+0 ->(3)
 // input: 8
 //output: 8
 // input: 12
 // output: 1+2 ->(3)
 
 import java.lang.*;
 import java.util.*;
 
 
 class Helper
 {
	 public int GenericRoot(int iNo) 
	 {
		 int iSum=0;
		 
		 if(iNo<0)      //updator
		 {
			 iNo=-iNo;
		 }
		 
		 iSum=iNo;
		 
		 while(iSum>9)    // loop to check whether iSum is single digit or not
		 {
			 iNo=iSum;
			 iSum=0; 
		 while(iNo!=0)
		 {
			 iSum=iSum+(iNo%10);
			 iNo=iNo/10;
		 }
		      
		 }
		
		 return iSum;
		 
	 }		 
		 
 }
 
 class Demo7
 {
	 public static void main(String arr[]) throws InputMismatchException
	 {
		 Helper hobj=new Helper();
		 Scanner sobj=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int value=sobj.nextInt();
		 
		 int iRes=hobj.GenericRoot(value);
		 System.out.println("Generic root of number is:\t"+iRes);
	 }
 }
 
		 

