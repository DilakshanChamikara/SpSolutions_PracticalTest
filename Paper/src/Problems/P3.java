package Problems;

public class P3 {

	public static void main(String[] args) {
		 int a = 0;
		 int b = 0;
		 int c = 1;
		 
		 System.out.print("100 Fibonacci numbers : ");
		 
		 for(int i = 1; i <= 100; i++) {
			 a = b;
			 b = c;
			 c = a + b;
			 
			 System.out.print(a + " ");
		 }
	}
}
