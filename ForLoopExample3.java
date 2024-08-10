package looping;

//Print Elements of an Array
public class ForLoopExample3 {
	public static void main(String[] args) {

		int numbers[] = { 2, 4, 6, 8, 10 };

									//5
		for (int i = 0; i < numbers.length; i++) {

			System.out.println("index " + i + ": " + numbers[i]);
		}
	}
}
