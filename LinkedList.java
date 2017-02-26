import java.io.*;
import java.util.*;


class LinkedList
{
	static Node head = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int choice;
		char ch;

		do
		{

		System.out.println("Enter your choice: 1. insert at end, 2. insert at beg, 3. insert at a particular position, 4. display the elements in linked list");
		choice = sc.nextInt();
		
		switch (choice)
            {
		case 1:
				int n;
				System.out.println("enter size of linkedlist for inserting end : ");
				n = sc.nextInt();
				System.out.println("Enter the elements");
				for(int i=0; i<n; i++)
				{
					insertAtEnd(sc.nextInt());
				}
				break;
		case 2:
				int num;
				System.out.println("enter size of linkedlist for inserting beginning : ");
				num = sc.nextInt();
				System.out.println("Enter the elements:");

				for(int i=0; i<num; i++)
				{
					insertAtBeg(sc.nextInt());
				}
				break;
		case 3:
				int len = lengthOfLL();
				System.out.println("Enter the position:");
				int pos = sc.nextInt();
				System.out.println("Enter the element:");
				int data = sc.nextInt();
				insertAtPos(pos,data,len);
				break;
				

		case 4:

				System.out.println("Displaying LinkedList:....");
				display();
				break;
		default:
				System.out.println("Wrong entry");
				break;
			}
			System.out.println("\nDo you want to continue (Type y or n) \n");
	        ch = sc.next().charAt(0);   
			
		
			} while (ch == 'y' || ch == 'Y');
	}

	public static void insertAtEnd(int val)
	{
		if(head == null)
		{
			head = new Node(val);
		}
		else
		{
			Node temp = head;

			while(temp.next != null)
			{
				temp = temp.next;
			}
		
			temp.next = new Node(val);
		

		//System.out.println("Node inserted at the End: " + temp.next.data); 
	}
	}

	public static void insertAtBeg(int data)
	{
		if(head == null)
		{
			head = new Node(data);
		}
		else
		{
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;

		}
	}

	public static void insertAtPos(int pos, int data,int len)
	{
		

		if(len == 0)
		{
			head = new Node(data);
			len++;
		}
		else if(pos == 0)
		{
			insertAtBeg(data);
		}
		else if(pos > len)
		{
			insertAtEnd(data);
		}
		else
		{

			Node newNode = new Node(data);
			Node temp = head;

			for(int i=1;i<pos;i++)
			{
				temp = temp.next;
			}

			newNode.next = temp.next;
			temp.next = newNode;

			len++;

		}
		display();
		System.out.println("After insertion length of LinkedList is: " + len);
	}

	public static void display()
	{
		if(head == null)
		{
			System.out.print("List is empty!");
		}
		else
		{
			Node temp = head;

			while(temp != null)
			{
				System.out.print(temp.data + "->");
				temp=temp.next;
			}
		}
		
	}

	public static int lengthOfLL()
	{
		
		int count = 0;

		if(head == null)
			return 0;

		else
		{

			Node temp = head;
			while(temp != null)
			{
				count++;
				temp = temp.next;
				
			}

			return count;
		}


	}
}