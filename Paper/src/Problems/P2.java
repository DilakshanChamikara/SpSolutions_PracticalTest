package Problems;

import java.util.ArrayList;
import java.util.List;

public class P2 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
//		System.out.println(list1.get(0));
		
		List<String> list2 = new ArrayList<String>();
		list2.add("1");
		list2.add("2");
		list2.add("3");
//		System.out.println(list2.get(0));
		
		List<String> combinedList = new ArrayList<String>();
		
		int a = 0;
		int b = 0;
		
		while(a < list1.size() && b < list2.size()) {
			combinedList.add(list1.get(a));
			a++;
			
			combinedList.add(list2.get(b));
			b++;
		}
	
		System.out.println(combinedList);
	}

}
