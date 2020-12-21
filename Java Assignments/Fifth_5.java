
/* Write a program which accept total marks & obtained marks from user and
calculate percentage.

Input : 1000 745
 Output : 74.5% 
 */
 
import java.lang.*;
import java.io.*;

class Demo
{
	public float Per(float iNo1,float iNo2)
	{
		float per=0.0f;
		
		per=(iNo2/iNo1)*100;
		
		return per;
	}
}

class Fifth_5
{
	public static void main(String arg[]) throws Exception
	{
		InputStreamReader iobj=new InputStreamReader(System.in);
		BufferedReader bobj=new BufferedReader(iobj);
		
		System.out.println("Enter the total marks");
		float mno1=Float.parseFloat(bobj.readLine());
		
		System.out.println("Enter the obtained marks");
		float mno2=Float.parseFloat(bobj.readLine());
		
	
		Demo dobj=new Demo();
		
		float iRes=dobj.Per(mno1,mno2);
		
		System.out.println("percentage of marks are:\t"+ iRes+"%");
			
	}
}	