package StackCN;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {
	Queue<Integer> q1;
	Queue<Integer> q2;
	public StackUsing2Queues()
	{
		q1=new LinkedList();
		q2=new LinkedList();
	}
	public void push(int element)
	{
		q2.add(element);
		
		while(!q1.isEmpty())
		{
			q2.add(q1.remove());
		}
		//Swap the q1 and q2
		Queue<Integer> tempQ=q2;
		q2=q1;
		q1=tempQ;
	}
	public int pop()
	{
	   return q1.remove();
	}
	public int top()
	{
		return q1.peek();
		
	}
	public int getSize()
	{
		return q1.size();
	}
	public boolean isEmpty()
	{
		return q1.size()==0;
	}
	

}
