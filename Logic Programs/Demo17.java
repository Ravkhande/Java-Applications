
//accept matrix from user and display addition of all elements from each row separately
// Input: row=4, iCol=4;
 
  
  
 import java.lang.*;
 import java.util.*;
 
 class Matrix
 {
	 void SumRow(int arr[][])
	 {
		 int iSum=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr[i].length;j++)
			 {
				 iSum=iSum+arr[i][j];
			 }
			 System.out.println("Addition of :\t"+i+"row is\t"+iSum); 
			 iSum=0;
		 }
		 
	 }
 }
 
 class Demo17
 {
	 public static void main(String args[])
	 {
		 Scanner sobj=new Scanner(System.in);
		 System.out.println("Enter number of rows");
		 int row=sobj.nextInt();
		 
		 System.out.println("Enter number of columns");
		 int col=sobj.nextInt();
		 
		 int arr[][]=new int[row][col];
		 
		 System.out.println("Enter the elements");
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println("Row with index : "+i);
			 for(int j=0;j<arr[i].length;j++)
			 {
				 System.out.println("Enter the element :"+i+" , "+j);
				 arr[i][j]=sobj.nextInt();
			 }
		 }
		 
		 Matrix mobj=new Matrix();
		 mobj.SumRow(arr);
		 
	 }
 }
		 
		 
		 
		 
  
  