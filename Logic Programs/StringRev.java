//Accept string from user and reverse each word of string in place
/*

/Input :  _ _ _HEllo_ _ _ _India_ _Demo_ _
//Output : _ _ _ollEH_ _ _ _aidnI_ _omeD_ _


*/
// in java in string there is no '\0'


import java.lang.*;
import java.util.*;
class DemoString
{
	public void ReverseInPlace(String str) 
	{
		char arr[] = str.toCharArray();
		int size = arr.length;
		int i=0,j=0,iEnd=0,iStart=0;
		char temp='\0';

           while(i<size)
           {

            if(arr[i]==' ')
            {
            	while((i<size) && (arr[i]==' '))
            	{
            		i++;
            	}
            }

            iStart=i;
            iEnd=i;

			while((i<size) && (iEnd!=' '))
			{
				iEnd++;
				i++;
				 j++;   
			}

			iEnd--;
		

			while((i<size) && (iStart<iEnd))
			{
				temp=arr[iStart];
				arr[iStart]=arr[iEnd];
				arr[iEnd]=temp;
                iStart++;
				iEnd--;  
		
			}
        
             while(j<i)
             {
             	System.out.print(arr[j]);
             	j++;
             }
			
      
	      }
	} 

 }

		


class StringRev
{
	public static void main(String arg[]) throws Exception
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");

		String str = sobj.nextLine();
		DemoString dobj = new DemoString();

		dobj.ReverseInPlace(str);
		
	}
}




