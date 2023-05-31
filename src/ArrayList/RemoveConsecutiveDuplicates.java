package ArrayList;

import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,10,10,20,20,20,30,30,30,40,10};
		
		ArrayList<Integer> result= removeConsecutiveDuplicates(arr);
		for(int i: result)
			System.out.print(i+" ");

	}

	private static ArrayList<Integer> removeConsecutiveDuplicates(int[] arr) {
		// TODO Auto-generated method stub
		ArrayList<Integer> res=new ArrayList<>();
		res.add(arr[0]);
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]!=arr[i-1])
			res.add(arr[i]);
	}
		return res;
	}

}
