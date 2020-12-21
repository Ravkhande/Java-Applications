
import Marvellous.MarvellousArray;       //Here we import MarvellousArray class from Marvellous folder
import java.lang.*;
import java.util.*;

class Searching extends MarvellousArray
{
	public Searching(int size)
	{
		super(size);  // By using super keyword we call Immediate Base class Consrtructor inside derived class constructor
	}

    public boolean LinearSearch(int no)
     {
     	int i=0;
     	
     	for(i=0;i<arr.length-1;i++)
     	{
     		if(arr[i]==no)
     		{
     			break;
     		}
     	}

        if(arr[i]==no)
        {

        return true;
    }
    else
    {
    	return false;
    }
}
    
/*
    boolean flag=false;
    for(int i=0;i<arr.length;i++)
     	{
     		if(arr[i]==no)
     		{
     			flag=true;
     			break;
     		}
     	}

     	return flag;

*/

     	public boolean LinearSearchBI(int no)
     	{
     		int start=0,end=0;
     		boolean flag=false;

     		for(start=0,end=arr.length-1;start<=end;start++,end--)
     		{
                 if((arr[start]==no) || (arr[end]==no))
                 {
                 	flag=true;
                 	break;
                 }
     		}

     		return flag;
     	}


       public boolean BinarySearch(int no)        // Time complexity is less than N/2;
       {
       	int start=0,end=0,middle=0;
          boolean flag=false;
        end=arr.length-1;
        boolean bRet=false;

        bRet=CheckSorted();
        if(bRet==false)
        {
        	System.out.println("Array is not sorted");
        	return false;
        }
        else
        {
        	System.out.println("Array is sorted");
        }

       	while(start<=end)
       	{
       		middle=(start+end)/2;

       		if(arr[middle]==no)
       		{
       			flag=true;
       			break;
       		}
       		if(no>arr[middle])
       		{
       			start=middle+1;
       		}
       		if(no<arr[middle])
       		{
       			end=middle-1;
       		}

       	}

       	return flag;
       }
     

   /*

   public boolean BinarySearch(int no)
       {
       	int start=0,end=0,middle=0;
          boolean flag=false;
        end=arr.length-1;

       	while(start<=end)
       	{
       		middle=(start+end)/2;

       		if((arr[middle]==no) || (arr[start]==no) || (arr[end]==no))
       		{
       			flag=true;
       			break;
       		}
       		if(no>arr[middle])
       		{
       			start=middle+1;
       		}
       		if(no<arr[middle])
       		{
       			end=middle-1;
       		}

       	}

       	return flag;
       }
     
     */

       public boolean CheckSorted()
       {
            boolean flag=true;

            for(int i=0;i<arr.length-1;i++)
            {
            	if(arr[i]>arr[i+1])
            	{
            		flag=false;
            		break;
            	}
            }

            return flag;
       }

}



class Demo3
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter size :");

		int size=sobj.nextInt();
         
         Searching Sobj=new Searching(size);

         Sobj.Accept();
         Sobj.Display();

         System.out.println("Enter the element to serach :");
         int value=sobj.nextInt();

         boolean bRet=Sobj.BinarySearch(value);

         if(bRet==true)
         {
         	System.out.println("Element is found");
         }
         else
         {
         	System.out.println("Element is not found");
         }

	}
}

