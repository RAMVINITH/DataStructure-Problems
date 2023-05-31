package BinarySearchTree;

public class BstUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		!!!Build the BST using Sorted Array
		int arr[]= {1,2,3,4,5,6,7,8};
		BinaryTreeNode<Integer>root=sortedArrayToBST(arr,0,arr.length-1);
		elementsInRangeK1K2(root,1,8);
		

	}
	public static boolean searchInBST(BinaryTreeNode<Integer>root,int k)
	{
		if(root==null)
			return false;
		
		if(k==root.data)
			return true;
		boolean TorF;
		if(k<root.data)
			TorF=searchInBST(root.left,k);
		else
			TorF=searchInBST(root.right,k);
		return TorF;
	}
	
	public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){

		if(root==null)
		return;
       
	    if(root.data>k2)
		elementsInRangeK1K2(root.left, k1, k2);
		else if(root.data<k1)
		elementsInRangeK1K2(root.right, k1, k2);
		else
		{
		
			elementsInRangeK1K2(root.left, k1, k2);
		    System.out.print(root.data+" ");
			elementsInRangeK1K2(root.right, k1, k2);
			
		}
		
	}
	
	public static BinaryTreeNode<Integer> sortedArrayToBST(int arr[],int si,int ei)
	{
		if(si>ei)
			return null;
		int midlen=(si+ei)/2;
		BinaryTreeNode<Integer>newNode=new BinaryTreeNode<Integer>(arr[midlen]);
		newNode.left=sortedArrayToBST(arr,si,midlen-1);
		newNode.right=sortedArrayToBST(arr,midlen+1,ei);
		return newNode;
	}
	
	
	
}