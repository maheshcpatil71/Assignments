package looping;
//the Sum of the First 10 Natural Numbers
public class ForLoopExample2 {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("Sum: " + sum);
	}
}
