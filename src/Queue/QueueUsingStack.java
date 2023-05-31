package Queue;

import java.util.Stack;

public class QueueUsingStack<T> {
    Stack<T> s1;
    Stack<T> s2;
    
    public QueueUsingStack()
    {
    	s1=new Stack<T>();
    	s2=new Stack<T>();
    }
    public void enqueue(T data)
    {
      s1.push(data);	
    }
    public T dequeue()
    {
    	if(s1.size()==0)
    	{
    		System.out.println("Queue is empty");
    		return null;
    	}
    	else
    	{
    	T temp=null;
    	while(!s1.isEmpty())
    		s2.push(s1.pop());
    	temp=s2.pop();
    	while(!s2.isEmpty())
    		s1.push(s2.pop());
    	return temp;
    	}
    }
    
    public int size()
    {
    	return s1.size();
    }
    public boolean isEmpty()
    {
    	return s1.size()==0;
    }
    public T front()
    {
    	if(s1.size()==0)
    	{
    		System.out.println("Queue is empty");
    		return null;
    	}
    	else
    	{
    	T temp=null;
    	while(!s1.isEmpty())
    		s2.push(s1.pop());
    	temp=s2.peek();
    	while(!s2.isEmpty())
    		s1.push(s2.pop());
    	return temp;
    	}
    }
}
