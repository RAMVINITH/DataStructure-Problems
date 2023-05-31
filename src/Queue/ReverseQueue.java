package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class ReverseQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Queue<Integer> q=new LinkedList();
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	for(int i:arr)
		q.add(i);
	
	System.out.println("Before reversing the element in tthe Queue :");
	while(!q.isEmpty())
		System.out.print(q.remove()+" ");
	System.out.println();
	
	for(int i:arr)
		q.add(i);
	reverseQueue(q);
	System.out.println("After reversing the element in the Queue :");
	while(!q.isEmpty())
		System.out.print(q.remove()+" ");
	
		

	}
	public static void reverseQueue(Queue<Integer>q)
	{
		if(q.isEmpty())
			return;
		int temp=q.remove();
		reverseQueue(q);
		q.add(temp);	
	}

}
