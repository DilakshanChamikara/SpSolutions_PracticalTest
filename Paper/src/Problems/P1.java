package Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		int sumF = 0;
		int sumW = 0;
		int sumR = 0;
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number:");
		num1 = sc.nextInt();
		list1.add(num1);
		
		System.out.print("Enter the second number:");
		num2 = sc.nextInt();
		list1.add(num2);
		
		System.out.print("Enter the third number:");
		num3 = sc.nextInt();
		list1.add(num3);
		
		//for loop
		for(int i = 0; i < list1.size(); i++) {
			sumF += list1.get(i);
		}
		System.out.println("The Sum of three numbers:" + sumF);
		
		//while loop
		int count = 0;
		while(list1.size() > count) {
			sumW += list1.get(count);
			count++;
		}
		System.out.println("The Sum of three numbers:" + sumW);
		
		//Recusion
		if(list1.size() >= 0) {
			System.out.println("The Sum of three numbers:" + (list1.get(0) + list1.get(1) + list1.get(2)));
		}else {
			System.out.println("The List is empty.");
		}
		
		
//		sumF = SumUsingForLoop(num1, num2, num3);
//		System.out.println("The Sum of three numbers:" + sumF);

	}

//	public static int SumUsingForLoop(int a, int b, int c) {
//		
//		int sum = a + b + c;
//		return sum;
//		
//	}


}
