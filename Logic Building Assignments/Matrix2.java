
/*
Write a program which accept matrix and one number from user and return
frequency of that number.
Input : 
Number : 9 

     3 2 5 9
     4 3 2 2
     8 4 1 9
     3 9 7 5
	 
	 Output : 9 
	 */
	 
import java.lang.*;
import java.util.*;

class Matrix
{
int Frequency(int Arr[][], int iRow, int iCol,int iNo)
{
	int iCnt=0;
	  for(int i=0;i<iRow;i++)
	  {
		  for(int j=0;j<iCol;j++)
		  {
			  if(Arr[i][j]==iNo)
			  {
				  iCnt++;
			  }
		  }
	  }
	  
	  return iCnt;
				  
}
}

class Matrix2
{
	public static void main(String args[])
	{
		
	Matrix mobj=new Matrix();
	Scanner sobj=new Scanner(System.in);
	System.out.println("Enter rows:");
	int row=sobj.nextInt();
	
	System.out.println("Enter columns:");
	int column=sobj.nextInt();
	
	
	int arr[][]=new int[row][column];
	
	System.out.println("Entered the elements :");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("Row with index : " +i);
		for(int j=0;j<arr[i].length;j++)
		{
		   System.out.println("Enter elements are : "+i+","+j);		   
			arr[i][j]=sobj.nextInt();
		}
	}
	
	System.out.println();
	System.out.println("Enter one number");
	int value=sobj.nextInt();
	
	
	int iRes=mobj.Frequency(arr,row,column,value);
	System.out.println();
	System.out.println("frequency of that number is : " + iRes);
	
	}
}
