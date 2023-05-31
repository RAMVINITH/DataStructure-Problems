package StackCN;
import java.util.Stack;
public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		Stack <Integer>input=new Stack();
		Stack <Integer>extra=new Stack();
		for(int i:arr)
			input.push(i);
		reverseStack(input,extra);
		print(input); 
		  
	}
	public static void print(Stack <Integer>input)
	{
		while(!input.isEmpty())
			System.out.print(input.pop()+" ");
	}
	public static void reverseStack(Stack <Integer>input,Stack <Integer>extra)
	{
		extra=reverse(input,extra);


		while(!extra.isEmpty())
		{
			int temp=extra.pop();
//			System.out.print(temp+"-");
			input.push(temp);	
		}

		
	}
	public static Stack<Integer> reverse(Stack <Integer>input,Stack <Integer>extra)
	{
		if(input.isEmpty())
			return extra;
		int temp=input.pop();
		
		extra = reverse(input,extra);
//		System.out.println(temp);
		extra.push(temp);
		return extra;
		
	}

}
