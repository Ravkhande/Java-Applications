

import java.lang.*;


class Demo implements Cloneable
{
	 public int no1,no2;
      
	  public Demo(int x,int y)
	  {
		   no1=x;
		   no2=y;
	  }
	  
	  protected Object clone() throws CloneNotSupportedException
	  {
		  return super.clone();      // it will call the clone method of parent class 
	  }
	  
}
	 
class Clone
{
	public static void main(String args[]) throws Exception
	{
		Demo obj1=new Demo(11,21);
		Demo obj2=obj1;      //shallow copy
		
		System.out.println(obj1.hashCode());     // 100
		System.out.println(obj2.hashCode());    //100
		
		
		Demo temp1=new Demo(51,345);
		Demo temp2=(Demo)temp1.clone();      //deep copy
		    // here clone method returns the object therefore we  convert this into demo class by using typecasting
			
			System.out.println(temp1.hashCode());    //345
		System.out.println(temp2.hashCode());     //456
		
	}
}


			
           		