// Singly linked list creation in java

package MarvellousCollection;

import java.lang.*;
import java.util.*;

class Node
{
	public int data;
	public Node next;

	public Node(int value)
	{
		data = value;
		next = null;
	}
}

public class SinglyLinkedList
{
	public Node Head;

	public SinglyLinkedList()
	{
		Head = null;
	}

	public void InsertFirst(int no)
	{
		Node newn = new Node(no);
		// C 		PNODE newn = (PNODE)malloc(sizeof(NODE));
		// C++		PNODE newn = new NODE;
		// java 	Node newn = new Node(no);

		if(Head == null)
		{
			Head = newn;
		}
		else
		{
			newn.next = Head;
			Head = newn;
		}
	}

	public void InsertLast(int no)
	{
		Node newn = new Node(no);	// Kamal statement ahe
		if(Head == null)
		{
			Head = newn;
		}
		else
		{
			Node temp = Head;
			while(temp.next != null)
			{
				temp = temp.next;
			}

			temp.next = newn;
		}
	}

	public void Display()
	{
		Node temp = Head;
		System.out.println("Elements of linked list are: ");

		while(temp != null)
		{
			System.out.print("|"+temp.data+"|->");
			temp = temp.next;
		}
		System.out.println();
	}

	public int Count()
	{
		int icnt = 0;
		Node temp = Head;

		while(temp != null)
		{
			temp = temp.next;
			icnt++;
		}
		return icnt;
	}

	public void DeleteFirst()
	{
		if(Head == null)	// Empty
		{
			return;
		}
		else // one or more than one
		{
			Head = Head.next;
		}
	}

	public void DeleteLast()
	{
		if(Head == null)	// Empty
		{
			return;
		}
		else
		{
			if(Head.next == null)	// single node
			{
				Head = null;
			}
			else 			// more than one node
			{
				Node temp = Head;

				while(temp.next.next != null)
				{
					temp = temp.next;
				}
				temp.next = null;
			}
		}
	}

	public void InsertAtpos(int pos, int data)
	{
		int size = Count();
		if((pos <= 0) || (pos > size+1))
		{
			return;
		}
		if(pos == 1)
		{
			InsertFirst(data);
		}
		else if (pos == (size + 1))
		{
			InsertLast(data);
		}
		else
		{
			Node newn = new Node(data);
			Node temp = Head;
			for(int i = 1; i < pos-1; i++)
			{
				temp = temp.next;
			}

			newn.next = temp.next;
			temp.next = newn;
		}
	}

	public void DeleteAtpos(int pos)
	{
		int size = Count();
		if((pos <= 0) || (pos > size))
		{
			return;
		}
		if(pos == 1)
		{
			DeleteFirst();
		}
		else if (pos == (size))
		{
			DeleteLast();
		}
		else
		{
			Node temp = Head;
			for(int i = 1; i < pos-1; i++)
			{
				temp = temp.next;
			}

			temp.next = temp.next.next;
		}
	}
}