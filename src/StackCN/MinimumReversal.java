package StackCN;
import java.util.Stack;
public class MinimumReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="{{{{";
		int minRev=MinimumBracketReversal(input);
		if(minRev==-1)
			System.out.println("Unbalanced paranthesis");
		else
			System.out.println("Balanced -> minimum reversal need is "+minRev);

	}
	public static int MinimumBracketReversal(String input)
	{
		int count=0;
		char arr[]=input.toCharArray();
		Stack<Character>stack=new Stack();
		for(char c:arr)
		{
			if(c=='{')
				stack.push(c);
			else
			{
				if(stack.isEmpty() || stack.peek()=='}')
					stack.push(c);
				else
					stack.pop();	
			}		
		}
		if(stack.size()%2==0)
		{
			char a,b;
		   while(!stack.isEmpty())
		   {
			   a=stack.pop();
			   b=stack.pop();
			   if(a==b)
				   count++;
			   else 
				   count=count+2;
		   }
		   return count;
		}
		else
			return -1;
	}

}
