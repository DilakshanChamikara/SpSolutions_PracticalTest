package Problems;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class P4 {

	public static void main(String[] args) {
		Vector<String> array = new Vector<>();
		
		array.add("50");
		array.add("2");
		array.add("1");
		array.add("9");
		
		System.out.print("The Large Possible Number is : ");
		largePossibleNumber(array);
	}
	
	static void largePossibleNumber(Vector<String> array) {
		Collections.sort(array, new Comparator<String>() {

			@Override
			public int compare(String i, String j) {
				String ij = i + j;
				String ji = j + i;
				return ij.compareTo(ji) > 0 ? -1 : 1;
			}
		});
		
		Iterator iterator = array.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}
	}

}
