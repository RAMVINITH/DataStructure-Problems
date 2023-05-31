package StackCN;
import java.util.Stack;
public class RedundantBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="(x+y*(a-b))";
		if(checkRedundentBrackets(exp))
			System.out.println("Useless brackets is there");
		else
			System.out.println("There is no useless bracket");

	}

	private static boolean checkRedundentBrackets(String exp) {
		Stack<Character>stack=new Stack();
        Stack<Integer>stackcount=new Stack();
        int count=0;
        char arr[]=exp.toCharArray();
        int count2=0; // checking for single parenthesis eg-> (a)
        
        for(char c:arr)
        {
            if(c=='(')
            {
                stack.push(c);
                // System.out.println("push"+count);
                stackcount.push(count);
                count=0;
                count2++;
            }
            else if(c==')')
            {
                 // System.out.println("push"+count);
                if(count!=0)
                stackcount.push(count);
                // System.out.println("peek"+stackcount.peek());
                if(count==1)
                	return true;
                if(stackcount.peek()==0)
                    return true;
                stack.pop();
                stackcount.pop();
                count=0;
            }
            else
                count++;
        }
        if(count2==1)
            return true;
        else
        return false;
	}

}
