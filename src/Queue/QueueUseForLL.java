package Queue;

public class QueueUseForLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLinkedList<Character>q=new QueueUsingLinkedList();
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		char charArr[]= {'a','b','c','d'};
		for(char i:charArr)
			q.enqueue(i);
//		System.out.println("QueueSize "+q.size());
//		System.out.println(q.dequeue()+" ");
//		System.out.println(q.dequeue()+" ");
//		System.out.println(q.dequeue()+" ");
//		System.out.println("QueueSize "+q.size());
//		System.out.println("QueueFront "+q.front());
		while(!q.isEmpty())
			System.out.print(q.dequeue()+" ");

	}

}
