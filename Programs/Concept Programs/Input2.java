
/////   by using buffered way //////


import java.lang.*;
import java.io.*;

class Input2
{
	public static void main(String crr[]) throws Exception
	{
        InputStreamReader iobj=new InputStreamReader(System.in);  //to accept the input from keyboard
		BufferedReader bobj=new BufferedReader(iobj);
		
		System.out.println("Enter the name");
		String name=bobj.readLine();
		
		System.out.println("Enter the Age");
		int Age=Integer.parseInt(bobj.readLine());
		
		System.out.println("Enter the Percentage");
		float per=Float.parseFloat(bobj.readLine());
		
		System.out.println("The name is" +name);
		System.out.println("The Age is" +Age);
		System.out.println("The percentage is" +per);
         		
	}
}
