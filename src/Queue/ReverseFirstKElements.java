package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ReverseFirstKElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList();
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i:arr)
			q.add(i);
		
		q=reversefirstKElements(q,6);
		
		while(!q.isEmpty())
			System.out.print(q.remove()+" ");
		
		
		
		 	

	}
	public static Queue<Integer> reversefirstKElements(Queue<Integer>q,int k)
	{
		Stack<Integer> stack=new Stack();
		Queue<Integer>tempQ=new LinkedList();
		
		while(k>0)
		{
		stack.push(q.remove());
		k--;
		}
		
		while(!stack.isEmpty())
			tempQ.add(stack.pop());
		
		while(!q.isEmpty())
			tempQ.add(q.remove());
		
		return tempQ;
		
		
		
	}

}
