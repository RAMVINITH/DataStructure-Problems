package ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr= new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		for(int i=0;i<arr.size();i++)
		System.out.print(arr.get(i)+" ");
		
		System.out.println();
		
		arr.add(1,40); // it add 40 in index 1 and move 20,30 to next index.
		for(int i=0;i<arr.size();i++)
			System.out.print(arr.get(i)+" ");
		
		System.out.println();
		
		arr.set(1,5); //it replaces 5 in index of 1 (i.e:40)
		//For each loop where is 'i' is the element of arr.
		for(int i : arr)
			System.out.print(i+" ");
		
		System.out.println();
		
		arr.remove(1); // it removes the element in index 1
		for(int i:arr)
			System.out.print(i+" ");
		
		
		

	}

}
