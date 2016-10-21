
public class ForLoopAdding {

	public static void main(String[] args) {
		

		ForLoopAdding forloopadding = new ForLoopAdding();

		int A = 0;
		int B = 20;
		
		for (A=0; A<=10; A++) {

		int sum = forloopadding.add(A,B);
		System.out.println("Sum of A+B is:  " + sum);
		
		}
	}

		public int add(int A,int B) {
		return A + B;
	}
}
