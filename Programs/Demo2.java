
import Marvellous.MarvellousArray;
import java.lang.*;
import java.util.*;


class Demo2
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter size :");

		int size=sobj.nextInt();

		MarvellousArray mobj=new MarvellousArray(size);

		mobj.Accept();
		mobj.Display();

	}
}

