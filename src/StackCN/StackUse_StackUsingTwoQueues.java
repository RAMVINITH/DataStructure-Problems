package StackCN;

public class StackUse_StackUsingTwoQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsing2Queues stack=new StackUsing2Queues();
		int arr[]= {1,2,3,4,5};
		for(int i:arr)
			stack.push(i);
		System.out.println(stack.pop()+" ");
		stack.push(6);
		System.out.println("Top element="+stack.top()+" ");
		
		while(!stack.isEmpty())
			System.out.print(stack.pop()+" ");

	}

}
