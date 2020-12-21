
class Array
{
	public static void main(String mrr[])
	{
		////////single dimensional array
		
		//int arr[];   //Reference of array       //in java it is not allowed
		//int arr[];      //in c it is not allowed
		
		int arr[]=new int[5];
		System.out.println(arr.length);    ///it gives the no of elements in the array
		
	//	printf(sizeof(arr));     it gives the no of bytes allocted for that array
	
	int brr[]={10,20,30,40};
	System.out.println(brr.length);   //4
        brr[4]=50;            //it will occur the exeception therfore after this syntax it will not print anything
		            //exception in java same as segmentation fault in c++
		
		int isum=0;
		for(int icnt=0;icnt<brr.length;icnt++)     //for loop
		{
			isum=isum+brr[icnt];
		}
		
		 int isum1=0;
		 for(int no:brr)         //foreach loop in java
		 {
			 isum1=isum1+no;
		 }
		 
		System.out.println(isum); 
		System.out.println(isum1); 
		
		//////////Multidimensional array

     ///Type1
	    	int crr[][]=new int[3][4];
			System.out.println(crr.length);  //3
			System.out.println(crr[0].length);    //4
			
			for(int i=0;i<crr.length;i++)
			{
				for(int j=0;j<crr[0].length;j++)
				{
					System.out.println(crr[i][j]);
				}
			}
			
			///Type2
			
			int drr[][]=new int[3][];
			drr[0]=new int[4];
			drr[1]=new int[6];
			drr[2]=new int[5];
			
		for(int i=0;i<drr.length;i++)
			{
				for(int j=0;j<drr[0].length;j++)
				{
					System.out.println(drr[i][j]);
				}
			}
			
	}
}
			
	
		
		