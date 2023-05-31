package Queue;

public class QueueUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArray q=new QueueUsingArray();
		int arr[]= {1,2,3,4,5,6,7,8};
		for(int i:arr)
		q.Enqueue(i);
//		System.out.println("QueueSize= "+q.size());
//		System.out.println("QueueFrontElement= "+q.Front());
//		System.out.print(q.Dequeue()+" ");
//		q.Enqueue(9);
//		
		while(!q.isEmpty())
		{
			
			System.out.print(q.Dequeue()+" ");
		}
//		q.Enqueue(1);
//		q.Enqueue(2);
//		q.Enqueue(3);
//		while(!q.isEmpty())
//			System.out.print(q.Dequeue()+" ");
//		q.Enqueue(4);
//		System.out.println(q.Dequeue()+" ");
//		System.out.println(q.Dequeue()+" ");
//		System.out.println("QueueSize= "+q.size());
//		q.Enqueue(5);
//		q.Enqueue(6);
//		while(!q.isEmpty())
//		{
//			System.out.println("QueueSize= "+q.size());
//
//			System.out.print(q.Dequeue()+" ");
//		}
//		System.out.print(q.Dequeue()+" ");
		
	}

}
