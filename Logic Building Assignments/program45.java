

/* 
 Write a program which accept matrix and swap the contents of consecutive rows.
Input :
        
		 3 2 5 9
         4 3 2 2
         8 4 1 9
         3 9 7 5

 
Output :

         4 3 2 2
         3 2 5 9
         3 9 7 5
         8 4 1 9
		 
*/

import java.lang.*;
import java.util.*;

class Matrix
{
    void SwapRows(int Arr[][], int iRow, int iCol)
    {
		 int iStart=0,iEnd=0,temp=0;

          for(int j=0;j<iCol;j++)
          {

          	if(iEnd<iRow)
          	{
          		iEnd++;
          	}
            

          	while((iStart<iEnd) && (iEnd<iRow))
          	{
               temp=Arr[iStart][j];
               Arr[iStart][j]=Arr[iEnd][j];
               Arr[iEnd][j]=temp;
               
              iStart=iStart+2;
              iEnd=iEnd+2;

          	}

          	iStart=0;
          	iEnd=0;
            

          }

     System.out.println("Swap content of row matrix is :");
	for(int i=0;i<iRow;i++)
	{
		for(int j=0;j<iCol;j++)
		{
			System.out.print(Arr[i][j]+"\t");
		}
		System.out.println();
	}


		
      } 
}

class Fifth
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
	
	mobj.SwapRows(arr,row,column);
	
	}
}
		 
		 
