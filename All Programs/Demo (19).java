// Singly linked list creation in java

import MarvellousCollection.SinglyLinkedList;
import java.lang.*;
import java.util.*;

class Demo
{
	public static void main(String arg[]) throws Exception
	{
		SinglyLinkedList obj = new SinglyLinkedList();

		Scanner sobj = new Scanner(System.in);
		int choice = 1;
		int value = 0;
		int pos = 0;

		System.out.println("Maravellous Collection Framework");

		while(choice != 0)
		{
			System.out.println("__________________________");
			System.out.println("Enter your choice");
			System.out.println("__________________________");
			System.out.println("1 : Insert First");
			System.out.println("2 : Insert Last");
			System.out.println("3 : Insert at position");
			System.out.println("4 : Delete First");
			System.out.println("5 : Delete Last");
			System.out.println("6 : Delete at position");
			System.out.println("7 : Display");
			System.out.println("8 : Count");
			System.out.println("0 : Exit");
			System.out.println("__________________________");
			choice = sobj.nextInt();

			switch(choice)
			{
				case 1:
					System.out.println("Enter the value");
					value = sobj.nextInt();
					obj.InsertFirst(value);
					break;

				case 2:
					System.out.println("Enter the value");
					value = sobj.nextInt();
					obj.InsertLast(value);
					break;

				case 3:
					System.out.println("Enter the value");
					value = sobj.nextInt();

					System.out.println("Enter the position");
					pos = sobj.nextInt();
					obj.InsertAtpos(pos,value);
					break;

				case 4:
					obj.DeleteFirst();
					break;

				case 5:
					obj.DeleteLast();
					break;
					
				case 6:
					System.out.println("Enter the position");
					pos = sobj.nextInt();
					obj.DeleteAtpos(pos);
					break;

				case 7:
					obj.Display();
					break;

				case 8:
					System.out.println("Number of elements are : "+obj.Count());
					break;
			}
		}

		System.out.println("Thank you for using Marvellous Collenction Framework");
		
		obj.Head = null;
	}
}






































