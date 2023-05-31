package LinkedListCN;

import java.util.LinkedList;
import java.util.Scanner;

public class ChangeNextLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=takeInput(); // give input (9 9 9 -1) or (1 2 3 -1) please end the input by -1
		print(head);
		head=makeLLtoNextLargestNumber(head);
		print(head);
		

	}
	
	public static Node makeLLtoNextLargestNumber(Node head)
	{
		head=reverse(head);
		head=addOneUtil(head);
		head=reverse(head);
		return head;
	}
	public static Node addOneUtil(Node head)
	{
		int carry=1,sum;
		Node res=head;
		Node temp = null;
		while(head!=null)
		{
			sum=carry+head.data;
			carry=(sum>=10)?1:0;
			sum=sum%10;
			head.data=sum;
			temp=head;
			head=head.next;
		}
		if(carry>0)
		{
			Node newNode=new Node(carry);
			temp.next=newNode;
		}
		return res;  
		
	}
	public static Node reverse(Node head)
	{
		Node currNode=head;
		Node nextNode=null;
		Node prevNode=null;
		
		while(currNode!=null)
		{
			nextNode=currNode.next;
			currNode.next=prevNode;
			prevNode=currNode;
			currNode=nextNode;
		}
		return prevNode;
		
	}
	public static Node takeInput()
	{
		Scanner sc=new Scanner(System.in);
		Node head=null;
		Node tail=null;
		int data=sc.nextInt();
		while(data!=-1)
		{
			Node newNode=new Node(data);
			if(tail==null)
			{
				head=newNode;
				tail=newNode;
			}
			else 
			{
			tail.next=newNode;
			tail=newNode;
			}
			data=sc.nextInt();
		}
		return head;
	}
	public static void print(Node head)
	{
		Node tail=head;
		while(tail!=null)
		{
			System.out.print(tail.data+"->");
			tail=tail.next;
		}
		System.out.println(tail);
	}

}

