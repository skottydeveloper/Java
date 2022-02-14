/* 
-  For this assessment task, you will be implementing the Selection Sort. 
-  Selection sort works by keeping the initial part of the array/list sorted (beginning with nothing sorted), and looking in the unsorted remainder of the array/list for the smallest available element, 
which will be put on the end of the sorted section (the sorted section grows by one element and the unsorted section shrinks by one element). 
-  When there's nothing left in the unsorted section, the algorithm has sorted the array/list.
-  The task is to write a method called selectionSort in the class SelectionSort. The method should take a List<Integer> as its only parameter, return void, and be public and static. 
-  After the method has finished, the list should be sorted. */

import java.util.List;
import java.util.ArrayList;

public class SelectionSort {
	public static void selectionSort(List<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			int smallestIndex = i;
			for (int j = i + 1; j < list.size(); ++j) {
				if (list.get(j) < list.get(smallestIndex)) {
					smallestIndex = j;
				}
			}

		int temp = list.get(i);
		list.set(i, list.get(smallestIndex));
		list.set(smallestIndex, temp);
	}
}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		selectionSort(list);
		System.out.println(list);
	}
}