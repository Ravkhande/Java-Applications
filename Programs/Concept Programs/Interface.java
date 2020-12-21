
import java.lang.*;

interface Hello
{
	void fun();
	void gun();
}

interface Mello
{
	void sun();
	void run();
}

/* class Base{
	
	public static int i;
	
	static{
		i=21;
	}
	
	public void mun()
	{
		System.out.println("inside mun");
	}
	
	
}

class Hello
{
	public void sun()
	{
		System.out.println("inside sun");
	}
	
	public void run()
	{
		System.out.println("inside run");
	
	}
}
*/
class Demo implements Hello,Mello
{
	public void fun()
	{
		System.out.println("inside fun");
	}
	
	public void gun()
	{
		System.out.println("inside gun");
	}
	
	
	
	public void sun()
	{
		System.out.println("inside sun");
	}
	
	public void run()
	{
		System.out.println("inside run");
	
	}
}

class Interface
{
	public static void main(String brr[])
	{
		System.out.println("inside main");
		Demo dobj=new Demo();
		dobj.fun();
		dobj.gun();
		dobj.sun();
		dobj.run();
		//dobj.mun();
		//System.out.println("value of i"+dobj.i);
	}
}

