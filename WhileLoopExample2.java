package looping;
//Sum of the First 10 Natural Numbers

public class WhileLoopExample2 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		while (i <= 10) {
			sum = sum + i;
			i++;
		}
		System.out.println("Sum: " + sum);
	}
}
