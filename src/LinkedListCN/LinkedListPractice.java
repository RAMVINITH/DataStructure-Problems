package LinkedListCN;
import java.util.Scanner;
public class LinkedListPractice {
	
	public static Node createLinkedList()
	{
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(40);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		
		return  n1;
	}
	public static Node takeInputOptimised()
	{
		Scanner sc=new Scanner(System.in);
		Node head=null;
		Node tail=null;
		int data=sc.nextInt();
		while(data!=-1)
		{
			Node currNode=new Node(data);
			if(head==null)
			{
				head=currNode;
				tail=currNode;
			}
			else
			{
				tail.next=currNode;
				tail=currNode;
			}
			data=sc.nextInt();
		}
		return head;
		
	}
	
	public static Node takeInput()
	{
		Scanner sc=new Scanner(System.in);
		Node head=null;
		int data =sc.nextInt();
		while(data!=-1)
		{
			Node currNode=new Node(data);
			if(head==null)
			{
				
				head=currNode;
			}
			else
			{
				Node tail=head;
				
				while(tail.next!=null)
				{
				tail=tail.next;
				}
				
				tail.next=currNode;
			}
			data=sc.nextInt();
		}
		return head;
	}
	
	public static void print(Node head)
	{
		Node temp=head;
		while (temp.next!=null) 
		{
		  System.out.print(temp.data+"->");
		  temp=temp.next;
		}
		System.out.println(temp.data);
	}
	public static void incrementOne(Node head)
	{
		Node temp=head;
		while (temp!=null) 
		{
		  temp.data++;
		  temp=temp.next;
		}
	}
	public static int length(Node head)
	{
		Node temp=head;
		int c=0;
		while (temp!=null) 
		{
		  c++;
		  temp=temp.next;
		}
		return c;
	}
	public static Node insert(Node head,int element,int pos)
	{
		Node nodetobeInsert=new Node(element);
		if(pos==0)
		{
			nodetobeInsert.next=head;
			head=nodetobeInsert;
			return head;
		}
		else
		{
			Node prev=head;
			int count=0;
			while(count<pos-1)
			{
				prev=prev.next;
				count++;
				if(prev==null)
				{
					System.out.println("insert pos is greater than linked list length");
					return head;
				}
			}
			nodetobeInsert.next=prev.next;
			prev.next=nodetobeInsert;
			return head;
		}
	}
	public static Node insertRecursively(Node head,int data,int pos)
	{
		if(pos>0 && head==null)
			return head;
		if(pos==0)
		{
			Node nodetobeinserted=new Node(data);
			nodetobeinserted.next=head;
			return nodetobeinserted;
		}
		else
		{
			Node temp=insertRecursively(head.next,data,pos-1);
			head.next=temp;
			return head;
		}
	}
 	public static Node delete(Node head,int pos)
	{
		if(head==null)
			return null;
		else if(pos==0)
		{
			return head.next;
		}
		else
		{ 
			int count=0;
			Node prev=head;
			while(count<pos-1)
			{
				prev=prev.next;
				count++;
				if(prev.next==null)
				{
					System.out.println("Pos is greater then length of Linkedlist");
					return head;
				}
			}
			prev.next=prev.next.next;
			return head;
		}
	}
 	public static Node deleteNodeRecursively(Node head, int pos)
 	{
 		if(head==null)
 		return null;
 		if(pos==0 && head.next==null)
 			return null;
 		if(pos==0)
 		{
 			return head.next; 
 		}
 		Node temp=deleteNodeRecursively(head.next,pos-1);
 		head.next=temp;
 		return head;
 		
 	}
 	
 	
	public static void findNode(Node head,int num)
	{
		
		Node temp=head;
		int pos=0,f=0;
		while(temp!=null)
		{
			if((int)temp.data==num)
			{
				System.out.println("Index of the "+num+" is "+pos);
				f=1;
				break;
			}
			temp=temp.next;
			pos++;
		}
		if(f==0)
		System.out.println("num is not in linkedList");
	}
	public static Node rotateList(Node head,int numOfRotation)
	{
		if(head==null || numOfRotation==0)
			return head;
		else
		{
			
			int length=length(head);
			numOfRotation=numOfRotation%length;
			Node temp=head;
			
			for(int i=0;i<(length-numOfRotation)-1;i++)
			temp=temp.next;
			
			Node secondHead=temp.next;
			temp.next=null;
			
            Node temp2=secondHead;
            while(temp2.next!=null)
            	temp2=temp2.next;
            
            temp2.next=head;
            head=secondHead;
			
			return head;
		}
	}
	public static Node removeConsecutiveDuplicates(Node head)
	{
		if(head==null)
			return head;
		
		Node x=head;
		Node y=head;
		while(y.next!=null)
		{
			y=y.next;
			if((int)x.data!=(int)y.data)
			{
				x.next=y;
				x=y;
			}
		}
		x.next=null;
		return head;
	}
	
	public static void printReverse(Node head)
	{
		if(head==null)
			return;
		printReverse(head.next);
		System.out.print(head.data+" ");
	}
	
	public static boolean isPalindrome(Node head)
	{
		Node fast=head;
		Node slow=head;
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		fast=head;
		slow=reverseWithoutrecursion(slow);
		while(slow!=null)
		{
			if((int)fast.data!=(int)slow.data)
				return false;
			fast=fast.next;
			slow=slow.next;
		}
		return true;
		
	}
	public static Node reverseWithoutrecursion(Node head)
	{
		Node prev=null;
		Node curr=head;
		Node next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}

	
	
	public static Node reverseListRecursily(Node head)
	{
		if(head.next==null)
			return head;
		
		Node smallhead=reverseListRecursily(head.next);
		Node reversedtail=head.next;
		reversedtail.next=head;
		head.next=null;
		
		return smallhead;
	}
	
    public static Node EvenAfterOddLinkedList(Node head)
    {
    	Node dummyHead=new Node(0);
    	Node tail=dummyHead;
    	Node t=head;
    	Node temp;
    	
    	
    	while(t!=null)
    	{
    		if((int)t.data%2!=0)
    		{
    			temp=new Node((int)t.data);
    			tail.next=temp;
    			tail=tail.next;
    		}
    		t=t.next;
    	}
    	t=head;
    	while(t!=null)
    	{
    		if((int)t.data%2==0)
    		{
    			temp=new Node((int)t.data);
    			tail.next=temp;
    			tail=tail.next;
    		}
    		t=t.next;
    	}
    	
    	return dummyHead.next;
    	
    	
    }
    
    public static Node deleteEveryNnodes(Node head,int M,int N)
    {
    	if(M==0 && N==0)
            return head;
        if(M==0 && N>0)
            return null;
        
        Node tail=head;
        int skip=M-1,delcount=N;
        
        
        while(tail!=null)
        {
            
            if(skip>0)
            {
                tail=tail.next;
                skip--;
            }
            else{
              skip=M;
                while(delcount>0)
                {
                    if(tail.next!=null)
                    tail.next=tail.next.next;
                    
                    delcount--;
                }
              delcount=N;    
            }
        }
        return head;
    }
    public static Node swapTwoNodesbyData(Node head,int i,int j)
    {
    	 int x=0,y=0,pos=0;
         Node temp=head;
         while(temp!=null)
         {
             if(pos==i)
                 x=(int)temp.data;
             if(pos==j)
                 y=(int)temp.data;
             pos++;
             temp=temp.next;
         }
         temp=head;
         pos=0;
         while(temp!=null)
         {
             if(pos==i)
                 temp.data=y;
             if(pos==j)
                 temp.data=x;
             pos++;
             temp=temp.next;
             
         }
         return head;

       
    }
    public static Node swapTwoNodes(Node head, int posi,int posj)
    {
    	Node temp=head;
        Node a=null;
        Node b=null;
        int pos=0;
        while(temp!=null)
        {
     	   if(pos==posi)
     		   a=temp;
     	   if(pos==posj)
     		   b=temp;
     	   temp=temp.next;
     	   pos++;
        }
        head=swap(head,a,b);
        return head;
    }
    public static Node swap(Node head,Node a,Node b)
    {
//    	System.out.println((int)a.data+" "+b.data);
    	Node tail=head;
    	Node prevA=null;
    	Node prevB=null;
    	if(head==null)
    		return null;
    	if(a==b)
    		return head;
    	
    	while(tail!=a && tail!=null)
    	{
    		prevA=tail;
    		tail=tail.next;
    	}
    	tail=head;
    	while(tail!=b && tail!=null)
    	{
    		prevB=tail;
    		tail=tail.next;
    	}
    	if(a!=null && b!=null)
    	{
    		if(prevA!=null)
    			prevA.next=b;
    		else
    			head=b;
    		
    		if(prevB!=null)
    			prevB.next=a;
    		else 
    			head=a;
    		
     		//swap the two node
    		
    		Node temp=a.next;
    		a.next=b.next;
    		b.next=temp;	
    	}
    	else
    		System.out.println("Swaping not possible");
    	
    	return head;
    }
    
    public static Node bubbleSort(Node head)
    {
        Node temp1=head;
        
        while(temp1!=null)
        {
            Node temp2=head;
            while(temp2!=null)
            {
                if(temp2.next!=null)
                {
                    Node a=temp2;
                    Node b=temp2.next;
                    // System.out.println((int)a.data+" "+(int)b.data);
                    if((int)a.data>(int)b.data)
                    {
                        if(a==head)
                            temp1=b; // updating temp1 before swaping 
                        
                        // System.out.println("Swap"+(int)a.data+" "+(int)b.data);
                        temp2=b; // updating temp1 before swaping 
                        head=swap(head,a,b);   
                    }
                }
                temp2=temp2.next;
            }
            // System.out.println("__________________________");
            temp1=temp1.next;
        }
        return head;
    	
    }
    
    
    public static Node reverseK(Node head,int k)
    {
    	 if(head==null || k==0)
    		 return head;
    	 if(k<0)return null;
    	 
    	 Node temp=head;
    	 int size=1;
    	 while(temp.next!=null)
    	 {
    		 temp=temp.next;
    		 size++;
    	 }
    	 
    	 if(size<k)
         {
             head=reverse(head);
             return head;
         }
 		
    	 int reversecount=size/k;
    	 Node prevEnd=head;
    	 Node curr=head;
    	 for(int i=0;i<reversecount;i++)
    	 {
    		 Node a=curr;
    		 Node top=a;
    		 Node b=a.next;
    		 for(int j=0;j<k-1;j++)
    		 {
    			 temp=a;
    			 a=b;
    			 b=b.next;
                 a.next=temp;
    		 }
    		 if(i==0) head=a;
    		 prevEnd.next=a;
    		 
    		 curr=b;
    		 prevEnd=top;
    	 }
    	 prevEnd.next=reverse(curr);
    	 return head;
    	 
    }
    public static Node reverse(Node head)
    {
    	 Node prev=null;
         Node curr=head;
         Node next=null;
         
         while( curr!=null)
         {
             next=curr.next;
             curr.next=prev;
             prev=curr;
             curr=next;
             
         }
         return prev; 
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Node head= createLinkedList();
//		Node head=takeInput(); // timeComplexity= O(n*2)
		Node head=takeInputOptimised(); //timeComplexity =O(n) - Important note ->"provide input end with -1"
//		head = insert(head,100,2); //(Node,element, pos)
		print(head);
//		incrementOne(head);  // increment every element by one
//		head= delete(head,2);
//	    print(head);
//	    findNode(head,10);
//	    head=rotateList(head,7);
//	    print(head);
//	    head=removeConsecutiveDuplicates(head);
//	    print(head);
//	    printReverse(head);
//	    System.out.println();
//	    print(head);
//		System.out.println(isPalindrome(head)); // check list is palindrome or not but here it will change t
//		head=reverseWithoutrecursion(head);
//		head=insertRecursively(head,200,2); // (head,element,position to be inserted)
//		head=deleteNodeRecursively(head,7);
//		head=reverseListRecursily(head);
//		Node evenAfterOddLL=EvenAfterOddLinkedList(head);
//		print(head);
//		print(evenAfterOddLL);
//		head=deleteEveryNnodes(head,2,3); //(Node Head,skip Nodes,delete Nodes)(i.e: it deletes every 3nodes after 2 nodes)
//		head=swapTwoNodesbyData(head,0,1); //it will swap the data without changing the link
//		head=swapTwoNodes(head,5,6); //(head,posA,posB) ->it will swap the data by changing the link
//		head=bubbleSort(head);
//		head=reverseK(head,3); //(head,k)->reverse the nodes of the linked list 'k' at a time
		print(head);
//	    System.out.println("length "+ length(head));
	}

}
