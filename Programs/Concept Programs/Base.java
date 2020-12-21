
import java.lang.*;

class Base
{
  public static void main(String arr[])
  {
     System.out.println("Jay Hanuman");
	 for(int i=0;i<arr.length;i++)         //for loop
	 {
	  System.out.println("Command Line" + arr[i]);
	  }
	  
	  int iCnt=0;
	  while(iCnt<arr.length)       //while loop
	  {
		  System.out.println("Command Line" + arr[iCnt]);
		  iCnt++;
	  }
	  
	  int j=0;
	  do                 //do-while loop
	  {
		  System.out.println("Command Line" + arr[j]);
		  j++;
	  }while(j<arr.length);
	  
	  for(String Str: arr)          //foreach loop
	  {
		  System.out.println(Str);
	  }
	  
  }
}
	  