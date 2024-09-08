package cps2231_Unit9_thursdaylecture;
import java.util.*;

import java.util.Arrays;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Integer[] array = {3,4,95,4,15,34,3,6,5};
			ArrayList<Integer> list = new ArrayList<Integer> ( Arrays.asList(array));
			
			// printing ArrayList
			System.out.println(list);
			
			// add one item
			list.add(100);
			System.out.println(list);
			
			// remove one item
			list.remove(0);
			System.out.println(list);
			
			//shuffle
			java.util.Collections.shuffle(list);
			System.out.println(list);
			
			//max and min 
			System.out.println(java.util.Collections.max(list));
			System.out.println(java.util.Collections.min(list));

	}

}
