package BinaryTree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class BinaryTreeUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BinaryTreeNode<Integer> root=new BinaryTreeNode(1);
//		BinaryTreeNode<Integer> left=new BinaryTreeNode(2);
//		BinaryTreeNode<Integer> right=new BinaryTreeNode(3);
//		BinaryTreeNode<Integer> leftchild=new BinaryTreeNode(4);
//		root.left=left;
//		root.right=right;
//		left.right=leftchild;
//		BinaryTreeNode<Integer> root=takeTreeInput(true,0,true);
		BinaryTreeNode<Integer>root=takeInputLevelwise();
//		printwithLandR(root);
		System.out.println("Number of Nodes in the Tree is "+numberOfNodes(root));
		System.out.println("Sum of Nodes in the Tree is "+sumOfNodes(root));
		System.out.println("Printing PreOrder Traversal ");
		printPreorder(root);
		System.out.println();
		System.out.println("Printing PostOrder Traversal ");
		printPostorder(root);
		System.out.println();
		System.out.println("Printing InOrder Traversal ");
		printInorder(root);
		System.out.println();
//		System.out.println("LargestNode is "+largestNode(root));
//		System.out.println("Number of nodes greater then X is "+NodesGreaterThanX(root,5));
		System.out.println("Height of the Tree is "+heightOfTree(root));
//		System.out.println("Number of leaf Nodes is "+numberOfLeafNodes(root));
//		printNodeAtDepthK(root,2);
//		System.out.println();
		System.out.println("Printing Level Wise");
		printLevelWise(root);
//		System.out.println("Before Replacing node with that levels and Printing in InOrder Traversal");
//		printInorder(root);
//		replaceNodeWithDepth(root);
//		System.out.println();
//		System.out.println("After Replacing node with that levels and Printing in InOrder Traversal ");
//		printInorder(root);
//		System.out.println();
//		System.out.println("Printing Nodes without Siblings ");
//		printNodeWithoutSiblings(root);
//		System.out.println();
//_________________________________________________________________________
//		int X=3;
//		if(isNodePresentInTree(root,X))
//			System.out.println(X+" is present in the Tree");
//		else
//			System.out.println(X+" is not present in the Tree");
//_________________________________________________________________________
//		BinaryTreeNode<Integer> rootwithoutleaf=removeLeafNodes(root);
//		System.out.println("Printing Level Wise");
//		printLevelWise(rootwithoutleaf);
//_________________________________________________________________________		
//		MirrorTheTree(root);
//		System.out.println("After mirroring , Printing in Level Wise");
//		printLevelWise(root);
//_________________________________________________________________________
// !!!checking wheather each and every node of the Tree is balanced or not by 
// !!! Subtracting (left and right height of node is -1 or 0 or 1)	
//		if(isBalanced(root))
//			System.out.println("Every node in the Tree is Balanced -> Balanced Tree");
//		else 
//			System.out.println("NOT every node in the Tree is Balanced -> Unbalanced Tree");
//_____________________________________________________________________________/
////		!!! Taking input in levelwise
//	 BinaryTreeNode<Integer>root=takeInputLevelwise();
//	 System.out.println("Printing Level Wise");
//		printLevelWise(root);
//______________________________________________________________________________________
		
	}
	public static BinaryTreeNode takeTreeInput(boolean isRoot,int parentdata,boolean isLeftChild)
	{
		if(isRoot)
			System.out.println("Enter the root data");
		else
		{
			if(isLeftChild)
				System.out.println("Enter Left child of "+parentdata);
			else
				System.out.println("Enter Right child of "+parentdata);
		}
		Scanner sc=new Scanner(System.in);
		int rootdata=sc.nextInt();
		if(rootdata==-1)
			return null;
		BinaryTreeNode<Integer> root=new BinaryTreeNode(rootdata);
		BinaryTreeNode<Integer> leftchild=takeTreeInput(false,rootdata,true);
		BinaryTreeNode<Integer> rightchild=takeTreeInput(false,rootdata,false);
		root.left=leftchild;
		root.right=rightchild;
		return root;
	}
    public static void print(BinaryTreeNode<Integer> root)
    {
    	if(root==null)
    		return;
    	System.out.print(root.data);	
    	print(root.left);
        print(root.right);
    }
    public static void printwithLandR(BinaryTreeNode<Integer> root)
    {
    	if(root==null)
    		return;

    	if(root.left!=null && root.right!=null)
    		System.out.println(root.data+":Left->"+root.left.data+",Right->"+root.right.data);
    	else if(root.left!=null)
    		System.out.println(root.data+":Left->"+root.left.data+",Right->"+null);
    	else if(root.right!=null)
    		System.out.println(root.data+":Left->"+null+",Right->"+root.right.data);
    	else
    		System.out.println(root.data+":Left->"+null+",Right->"+null);
    		
    	printwithLandR(root.left);
    	printwithLandR(root.right);
    }
    public static int numberOfNodes(BinaryTreeNode<Integer> root)
    {
    	if(root==null)
    		return 0;
    	int leftNodes=numberOfNodes(root.left);
    	int rightNodes=numberOfNodes(root.right);
    	return 1+leftNodes+rightNodes;
    }
    public static int sumOfNodes(BinaryTreeNode<Integer>root)
    {
    	if(root==null)
    		return 0;
    	int leftsum=sumOfNodes(root.left);
    	int rightsum=sumOfNodes(root.right);
    	return root.data+leftsum+rightsum;
    }
    public static void printPreorder(BinaryTreeNode<Integer>root)
    {
    	if(root==null)
    		return;
    	System.out.print(root.data+" ");
    	printPreorder(root.left);
    	printPreorder(root.right);
    	
    }
    public static void printPostorder(BinaryTreeNode<Integer>root)
    {
    	if(root==null)
    		return;
    	printPostorder(root.left);
    	printPostorder(root.right);
    	System.out.print(root.data+" ");
    		
    }
    public static void printInorder(BinaryTreeNode<Integer>root)
    {
    	if(root==null)
    		return;
    	printInorder(root.left);
    	System.out.print(root.data+" ");
    	printInorder(root.right);
    }
    public static int largestNode(BinaryTreeNode<Integer> root)
    {
    	if(root==null)
    		return -1;
    	int leftlargest=largestNode(root.left);
    	int rightlargest=largestNode(root.right);
    	return Math.max(root.data,Math.max(leftlargest, rightlargest));
    }
    public static int NodesGreaterThanX(BinaryTreeNode<Integer>root,int x)
    {
    	if(root==null)
    		return 0;
    	int countleft,countright;
    	countleft=NodesGreaterThanX(root.left,x);
    	countright=NodesGreaterThanX(root.right,x);
    	return (root.data>x)? 1+countleft+countright :countleft+countright;
    }
    public static int heightOfTree(BinaryTreeNode<Integer>root)
    {
    	if(root==null)
    		return 0;
    	int leftHeightCount,rightHeightCount;
		leftHeightCount=heightOfTree(root.left);
		leftHeightCount++;
	    rightHeightCount=heightOfTree(root.right);
		rightHeightCount++;

		return Math.max(leftHeightCount,rightHeightCount);
    }
    public static int numberOfLeafNodes(BinaryTreeNode<Integer>root)
    {
    	if(root==null)
    		return 0;
    	if(root.left==null && root.right==null)
    		return 1;
    	
    	int rightleafcount,leftleafcount;
    	leftleafcount=numberOfLeafNodes(root.left);
    	rightleafcount=numberOfLeafNodes(root.right);
    	return (leftleafcount+rightleafcount);
    }
    public static void printNodeAtDepthK(BinaryTreeNode<Integer>root,int k)
    {
    	if(root==null)
    		return;
    	if(k==0)
    	{
    		System.out.print(root.data+",");
    	}
    	printNodeAtDepthK(root.left,k-1);
    	printNodeAtDepthK(root.right,k-1);
    	return;
    }
    public static void printLevelWise(BinaryTreeNode<Integer>root)
    {
    	Queue<BinaryTreeNode> q=new LinkedList();
    	q.add(root);
    	q.add(null);
    	BinaryTreeNode<Integer>temp=q.peek();
    	while(!q.isEmpty() && q.peek()!=null)
    	{
    		temp=q.poll();
    	    while(temp!=null)
    	    {
    	    	System.out.print(temp.data+" ");
    	    	if(temp.left!=null)
    	    		q.add(temp.left);
    	    	if(temp.right!=null)
    	    		q.add(temp.right);	
    	    	temp=q.poll();
    	    }
    	    q.add(null);
    	    System.out.println();
    	}
    }
    public static void replaceNodeWithDepth(BinaryTreeNode<Integer>root)
    {
    	Queue<BinaryTreeNode>q=new LinkedList();
    	q.add(root);
    	q.add(null);
    	BinaryTreeNode<Integer>temp=q.peek();
    	int levels=0;
    	while(!q.isEmpty() && q.peek()!=null)
    	{
    		temp=q.poll();
    		while(temp!=null)
    		{
    			temp.data=levels;
    			if(temp.left!=null)
    				q.add(temp.left);
    			if(temp.right!=null)
    				q.add(temp.right);
    			temp=q.poll();
    		}
    		q.add(null);
    		levels++;
    	}
    
    }
    public static void printNodeWithoutSiblings(BinaryTreeNode<Integer>root)
    {
    	Queue<BinaryTreeNode> q=new LinkedList();
    	q.add(root);
    	q.add(null);
    	BinaryTreeNode<Integer>temp=q.peek();
    	while(!q.isEmpty() && q.peek()!=null)
    	{
    		temp=q.poll();
    	    while(temp!=null)
    	    {
				if(temp.left!=null && temp.right==null)
    	    	System.out.print(temp.left.data+" ");
				if(temp.left==null && temp.right!=null)
    	    	System.out.print(temp.right.data+" ");
    	    	if(temp.left!=null)
    	    		q.add(temp.left);
    	    	if(temp.right!=null)
    	    		q.add(temp.right);	
    	    	temp=q.poll();
    	    }
    	    q.add(null);
    	    // System.out.println();
    	}
    }
    public static boolean isNodePresentInTree(BinaryTreeNode<Integer>root,int x)
    {
    	Queue<BinaryTreeNode> q=new LinkedList();
    	q.add(root);
    	q.add(null);
    	BinaryTreeNode<Integer>temp=q.peek();
		int flag =0;
    	while(!q.isEmpty() && q.peek()!=null)
    	{
    		temp=q.poll();
    	    while(temp!=null)
    	    {
    	    	// System.out.print(temp.data+" ");
				if(temp.data==x)
				flag=1;
    	    	if(temp.left!=null)
    	    		q.add(temp.left);
    	    	if(temp.right!=null)
    	    		q.add(temp.right);	
    	    	temp=q.poll();
    	    }
    	    q.add(null);
    	    // System.out.println();
    	}
		if(flag==1)
		return true;
		else
		return false;
    }
    public static BinaryTreeNode removeLeafNodes(BinaryTreeNode<Integer>root)
    {
    	if(root==null)
    		return null;
    	if(root.left==null && root.right==null)
    	{
    		return null;
    	}
    	root.left=removeLeafNodes(root.left);
    	root.right=removeLeafNodes(root.right);
    	return root;	
    }
    public static void MirrorTheTree(BinaryTreeNode<Integer>root)
    {
    	Queue<BinaryTreeNode>q=new LinkedList();
    	q.add(root);
    	q.add(null);
    	BinaryTreeNode<Integer>temp=q.peek();

    	BinaryTreeNode<Integer> swapNode1;
		BinaryTreeNode<Integer> swapNode2;
    	int tempdata;
    	
    	while(!q.isEmpty() && q.peek()!=null)
    	{
        	Stack<BinaryTreeNode> tempstack=new Stack();
        	Queue<BinaryTreeNode> tempQ=new LinkedList();

    		temp=q.poll();
    		int count=0;
    		while(temp!=null)
    		{
    			if(temp!=null)
    			{
//    		    System.out.println(temp.data);
    			tempstack.push(temp);
    			tempQ.add(temp);
    			count++;
    			}
    			if(temp.left!=null)
    				q.add(temp.left);
    			if(temp.right!=null)
    				q.add(temp.right);
    			temp=q.poll();
    			
    		}
    		count=count/2;
    		while(!tempQ.isEmpty() && count>0 )
    		{
//    		    System.out.println("Stack data "+tempstack.peek().data);
    			swapNode1=tempQ.poll();
    			swapNode2=tempstack.pop();
//    			System.out.println(swapNode1.data+"<->"+swapNode2.data);
    			tempdata=swapNode1.data;
				swapNode1.data=swapNode2.data;
				swapNode2.data=tempdata;
				count--;
    		}
    		q.add(null);
    	}
    	
    }
    
    public static boolean isBalanced(BinaryTreeNode<Integer>root)
    {
    	if(root==null)
    		return true;
    	int leftheight=heightOfTree(root.left);
    	int rightheight=heightOfTree(root.right);
    	if(Math.abs(leftheight-rightheight)>1)
    		return false;
    	boolean rootleft=isBalanced(root.left);
    	boolean rootright=isBalanced(root.right);
    	return rootleft && rootright;
    }
    
    public static BinaryTreeNode<Integer> takeInputLevelwise()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the root data");
    	int data=sc.nextInt();
    	if(data==-1)
    		return null;
    	BinaryTreeNode<Integer>root=new BinaryTreeNode<>(data);
    	Queue<BinaryTreeNode<Integer>> pendingChildren=new LinkedList<>();
    	pendingChildren.add(root);
    	while(!pendingChildren.isEmpty())
    	{
    		BinaryTreeNode<Integer> front=pendingChildren.poll();
    		System.out.println("Enter the left child of "+front.data);
    		int left=sc.nextInt();
    		if(left!=-1)
    		{
    			BinaryTreeNode<Integer>leftchild=new BinaryTreeNode<>(left);
    			front.left=leftchild;
    			pendingChildren.add(leftchild);
    		}
    		System.out.println("Enter the right child of "+front.data);
    		int right=sc.nextInt();
    		if(right!=-1)
    		{
    			BinaryTreeNode<Integer>rightchild=new BinaryTreeNode<>(right);
    			front.right=rightchild;
    			pendingChildren.add(rightchild);
    		}
    	}
    	return root;
    }
    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root)
    {
    	
    	if(root==null)
    	return new Pair<Integer,Integer>(Integer.MAX_VALUE,Integer.MIN_VALUE);

    	Pair<Integer,Integer>leftPair=getMinAndMax(root.left);
    	Pair<Integer,Integer>rightPair=getMinAndMax(root.right);
    	int minimum=Math.min(root.data, Math.min(leftPair.minimum,rightPair.minimum ));
    	int maximum=Math.max(root.data,Math.max(leftPair.maximum,rightPair.maximum));
    	return new Pair<Integer,Integer>(minimum,maximum);

    } 
    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root ==null)
		 return;
        
		BinaryTreeNode<Integer> dupNode=new BinaryTreeNode<Integer>(root.data);
		dupNode.left=root.left;
		root.left=dupNode;
		insertDuplicateNode(root.left.left);
		insertDuplicateNode(root.right);
		return;
	}
    

}
