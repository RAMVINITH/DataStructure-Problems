package LinkedList;

import java.util.LinkedList;

public class LinkedList_INS {
	    Node head;
	
	   static class Node
	   {
		   int data;
		   Node next;
		   Node(int data)
		   {
			   this.data=data;
			   next=null;
		   }
	   }
	   public void push(int data)
	   {
		   Node new_node=new Node(data);
		   new_node.next=head;
		   head=new_node;
	   }
	   public void append(int data)
	   {
		   Node new_node=new Node(data);
		   
		   if(head==null)
		   {
			   head=new_node;
			   
			   return;
		   }
		   new_node.next=null;
		   
		   Node last=head;
		   while(last.next!=null)
			   last=last.next;
		   last.next=new_node;
		   return;
	   }
	   public void printlist()
	   {
		   if(head==null)
		   System.out.println("empty");
		   
		   Node temp=head;
		  while(temp!=null)
		  {
			  System.out.println(temp.data);
			  temp=temp.next;
		  }
		   
	   }
	   public void insertAfter(Node prev_node,int data)
	   {
		   if(prev_node==null)
		   {
			   System.out.println("Prev node cannot be null");
			   return;
		   }
		   Node new_node=new Node(data);
		   new_node.next=prev_node.next;
		   prev_node.next=new_node;
	   }
	   
	   public void delete(int key)
	   {
		   Node temp=head;
		   Node prev=null;
		   
		   if(temp!=null && temp.data==key)
		   {
			   head=head.next;
		   }
		   
		   while(temp!=null && temp.data!=key)
		   {
			   prev=temp;
			   temp=temp.next;
		   }
		   if(temp==null)
			   return;
		   prev.next=temp.next;  
	   }

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LinkedList_INS list=new LinkedList_INS();
			list.append(3);
			list.push(2);
			list.push(1);
			list.append(4);
			list.insertAfter(list.head.next,7);
			list.delete(2);
			list.printlist();
		}

}
