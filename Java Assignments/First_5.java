
/* Write a program which accept name from user and print that name.
 Input : Piyush Khairnar
 Output : Piyush Khairnar 
 */
 
 
import java.lang.*;
import java.io.*;

class First_5
{
	public static void main(String arg[]) throws Exception
	{
		InputStreamReader iobj=new InputStreamReader(System.in);
		BufferedReader bobj=new BufferedReader(iobj);
		
		System.out.println("Enter the name");
		String str=bobj.readLine();
		
		System.out.println("Printed name is:\t"+str);
	}
}	
		
		