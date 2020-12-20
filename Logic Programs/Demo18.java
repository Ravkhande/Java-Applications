

//accept matrix from user and display largest number from each row
// Input: row=4, iCol=4;
 
  
 import java.lang.*;
 import java.util.*;
 
 class Matrix
 {
	 void MaxRow(int arr[][])
	 {
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 int iMax=arr[i][0];
			 for(int j=0;j<arr[i].length;j++)
			 {
				if(iMax<arr[i][j])
				{
					iMax=arr[i][j];
				}
				
			 }
			 System.out.println("Largest number from each row : "+i+"is\t"+iMax);
			 
		 }
		 
	 }
 }
 
 class Demo18
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
		 mobj.MaxRow(arr);
		 
	 }
 }
		 