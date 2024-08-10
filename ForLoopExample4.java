package looping;

public class ForLoopExample4 {

	public static void main(String[] args) {
		
		String str = "Mahesh";
		String rev = "";
		         
		//str.length()=6               6 >= 0
		for (int i = str.length() - 1; i >= 0; i--) {
			
			rev = rev + str.charAt(i);
		}
		System.out.println("Reversed String: " + rev);
	}
}
