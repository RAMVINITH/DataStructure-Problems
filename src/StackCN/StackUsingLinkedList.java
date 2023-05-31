package StackCN;

public class StackUsingLinkedList<T> {
	   private Node <T> head;
	   private Node <T>tail=head;
	   private int size;
	   
	   public StackUsingLinkedList()
	   {
		   head=null;
		   size=0;
	   }
	   public void push(T data)
	   {
		   
		  Node<T> newNode=new Node<T>(data);
		  newNode.next=head;
		  size++;
		  head=newNode;
	   }
	   public T pop() throws StackEmptyException
	   {
		   if(head==null)
			   throw new StackEmptyException();
		   T temp=(T) head.data;
		   head=head.next;
		   size--;
		   return temp;
	   }
	   public boolean isEmpty()
	   {
		   return size==-1;
	   }
	   public T top() throws StackEmptyException
	   {
		   if(head==null)
			   throw new StackEmptyException();
		   return (T)head.data;
	   }
	   public int size()
	   {
		   return size;
	   }
	   
}
