package Queue;

public class QueueUsingArray {
	
	private int arr[];
    private int front,rear,size;
	
	public QueueUsingArray()
	{
	    arr=new int[5];
	    size=0;
	    rear=-1;
	    front=-1;
	}
	public void Enqueue(int data)
	{
		if(rear==arr.length-1)
			doubleCapacity();
		if(size==0)
			front=0;
		rear++;
//		System.out.println("ArraySize "+arr.length +"rear "+rear +"data "+data);
		arr[rear]=data;
		size++;
	}
	
	public int Dequeue()
	{
		if(size==0)
			return -1;
		else 
		{
//			System.out.println("front "+front+"ArraySize "+arr.length);
			int temp=arr[front++];
			size--;
			return temp;
			
		}
			
	}
	public int Front()
	{
		if(front!=-1)
			return arr[front];
		else
			return -1;
	}
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public void doubleCapacity()
	{
//		System.out.println("double-----------------------");
		int temp[]=arr;
		arr=new int[temp.length*2];
		int index=0;
		
		for(int i=front;i<temp.length;i++)
		{
//			System.out.println(temp[i]+" "+index);
			
			arr[index++]=temp[i];
		}
		front=0;
		rear=--index;
		
		
	}
	

}
