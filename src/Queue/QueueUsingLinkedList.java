package Queue;

public class QueueUsingLinkedList<T> {

	Node<T> front;
	Node<T> rear;
	int size;
	public QueueUsingLinkedList()
	{
		front=null;
		rear=null;
	}
	public int size()
	{
		return size;
	}
	public T front()
	{
		if(size==0)
		{
			System.out.println("Queue is Empty");
			return null;
		}
		else
		return front.data;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public void enqueue(T data)
	{
		Node<T> newNode=new Node<T>(data);
		if(size==0)
		{
			front=newNode;
			rear=newNode;
			size++;
		}
		else
		{
			rear.next=newNode;
			rear=rear.next;
			size++;
		}
	}
	public T dequeue()
	{
		T deletedElement = null;
		if(size==0)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			deletedElement=front.data;
			front=front.next;
			if(front==null)
				rear=null;
			size--;
		}
		return deletedElement;
	}
}
