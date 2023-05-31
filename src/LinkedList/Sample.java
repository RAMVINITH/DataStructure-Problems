package LinkedList;
import java.util.*;
public class Sample {
	
	static class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			data=d;
			next=null;
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      List<Node>list=new LinkedList<>();
      list.add(new Node(1));
      for(Node node:list)
    	  System.out.println(node.data);
	}

}
