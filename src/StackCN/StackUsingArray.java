package StackCN;

public class StackUsingArray {

   private int arr[];
   private int top;
   
   public StackUsingArray()
   {
	   arr=new int[2];
	   top=-1; 
   }
   public StackUsingArray(int size)
   {
	   arr=new int[size];
	   top=-1;
   }
   
   public int size()
   {
	   return top+1;
   }
   
   public void push(int element) {
	   if(top==arr.length-1)
		   doubleCapacity();
	   arr[++top]=element;
   }
   
   private void doubleCapacity()
   {
	   System.out.println("Doubling");
	   
	   int temp[]=arr;
	   arr= new int[temp.length*2];
	   for(int i=0;i<temp.length;i++)
		   arr[i]=temp[i];
   }
   public int pop() throws StackEmptyException
   {
	   if(top==-1)
		   throw new StackEmptyException();
	   return arr[top--];
   }
   
   public int top() throws StackEmptyException
   {
	   if(top==-1)
		   throw new StackEmptyException();
	   return arr[top];
   }
   
   public boolean isEmpty()
   {
	  return top==-1;
   }
} 
