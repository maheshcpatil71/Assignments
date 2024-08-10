package looping;

public class WhileLoopExample3 {

	public static void main(String[] args) {

		int numbers[] = { 2, 4, 6, 8, 10 };

		int i = 0;
		while (i < numbers.length) {
			System.out.println("index " + i + ": " + numbers[i]);
			i++;
		}
	}
}
