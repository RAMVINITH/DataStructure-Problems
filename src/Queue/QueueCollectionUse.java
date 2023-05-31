package Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class QueueCollectionUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Queue<Integer> q=new Queue<>();
//		!!!important note-> we cannot create the object for queue as same as stack and Linked list because queue 
//      is a INTERFACE but stack and linked list are class
//		so, we have use linked list to implement the queue and we create a object
		
		Queue<Integer> q= new LinkedList();
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println("To see the front of Queue use Peek "+q.peek());
		System.out.println("To see the size of Queue use size "+q.size());
		while(!q.isEmpty())
			System.out.print(q.poll()+" "); // poll() and remove() are used to remove the element from the queue
		
		
		
      
	}
	
}


