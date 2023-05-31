package StackCN;
import java.util.Stack;
public class BalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> stack=new Stack();
		int f=0;
		char arr[]= {'[',']','{','(','(',')','}'};
		
		for(char a:arr)
		{
			if(a=='{'||a=='('||a=='[')
				stack.push(a);
			else if(a=='}'||a==']'||a==')')
			{
				if(stack.isEmpty())
					f=1;
				else
				{
					if(a==')' && stack.peek()=='(')
					stack.pop();
					else if(a=='}' && stack.peek()=='{')
						stack.pop();
					else if(a==']' && stack.peek()=='[')
						stack.pop();
					else
						f=1;
				}
			}
		}
		if(f==0 && stack.isEmpty())
			System.out.println("Balanced Paranthesis");
		else
			System.out.println("Unbalanced Paranthesis");
	}

}
