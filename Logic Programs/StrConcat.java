import java.lang.*;
import java.util.*;

class StringDemo
{
  public String StrNCatX(String src,String dest,int iCnt)
  {
    char Arr[]=src.toCharArray();
	char Brr[]=dest.toCharArray();
	int size=Arr.length;
	int i=0;
	for(i=0;i<size;i++)
	{
	   System.out.print(Arr[i]);
	}
    for(i=0;i<iCnt;i++)
	{  
	  System.out.print(Brr[i]);
	}
	return src;
  }
 }
  
class StrConcat
{ 
  public static void main(String args[])
  {
     Scanner sobj=new Scanner(System.in);
	 System.out.println("enter the string 1");
	 String str=sobj.nextLine();
	 System.out.println("enter the string 2");
	 String strs=sobj.nextLine();
	 System.out.println("enter the value");
	 int Value=sobj.nextInt();
	 StringDemo ss=new StringDemo();
	 ss.StrNCatX(str,strs,Value);
  }

 
}