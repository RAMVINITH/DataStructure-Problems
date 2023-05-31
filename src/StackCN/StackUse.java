package StackCN;

public class StackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		// TODO Auto-generated method stub
		StackUsingArray stack=new StackUsingArray(); 
		StackUsingLinkedList<Character> stackLL=new StackUsingLinkedList();
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//		int deletedElement=stack.pop();
//		boolean checkStack=stack.isEmpty();
//        int topElement=stack.top();
//        int size=stack.size();
//        System.out.println("Deleted element-"+deletedElement);
//        System.out.println("TopElement-"+topElement);
//        System.out.println("Size-"+size);
		char array[]= {'a','b','c','d','e'};
		
		for(char i : array)
			stackLL.push(i);
//		System.out.println(stackLL.pop());
		for(int i : array)
			System.out.println(stackLL.pop());
	
		
	}

}
