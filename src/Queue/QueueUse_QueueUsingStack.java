package Queue;

public class QueueUse_QueueUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStack<Integer>q=new QueueUsingStack();
		int arr[]= {1,2,3,4,5};
		for(int i:arr)
			q.enqueue(i);

		q.enqueue(7);
		System.out.println("front element"+q.front());
		System.out.println("Queue size"+q.size());
		while(!q.isEmpty())
			System.out.print(q.dequeue()+" ");

	}

}
