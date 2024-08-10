package looping;

public class SwitchExample3 {

    public static void main(String[] args) {

        int no = 4;

        switch (no) {
            case 1:
                System.out.println("The square of " + no + " is " + (no * no));
                break;
            case 2:
                System.out.println("The square of " + no + " is " + (no * no));
                break;
            case 3:
                System.out.println("The square of " + no + " is " + (no * no));
                break;
            case 4:
                System.out.println("The square of " + no + " is " + (no * no));
                break;
            case 5:
                System.out.println("The square of " + no + " is " + (no * no));
                break;
            default:
                System.out.println("Number not between 1 and 5.");
                break;
        }
    }
}
