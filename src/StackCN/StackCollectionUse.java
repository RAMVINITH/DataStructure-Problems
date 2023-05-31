package StackCN;

import java.util.Stack;

public class StackCollectionUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>stack=new Stack();
//		stack.push(5);
//        stack.push(10);
//        stack.push(15);
//        System.out.print(stack.pop()+stack.size());
		int arr[]= {1,2,3,4,5};
		for(int i:arr)
			stack.push(i);
		System.out.println("topmost element="+stack.peek()); // To see topmost element of the stack.
		System.out.println("check stack is empty = "+stack.isEmpty());
		System.out.println("size of stack="+stack.size());
		for(int i:arr)
			System.out.println("deleted element"+stack.pop());
	

	}

}
