package looping;

public class SwitchExample4 {

    public static void main(String[] args) {

        int option = 2;

        switch (option) {
            case 1:
                System.out.println("Option 1: View Balance");
                System.out.println("Balance is 358569.00 ₹");
           
                break;
            case 2:
                System.out.println("Option 2: Withdraw Money");
                System.out.println("Withdraw Money 1500.00 ₹");

                break;
            case 3:
                System.out.println("Option 3: Deposit Money");
                System.out.println("Deposit Money 100.00 ₹");
                break;
            case 4:
                System.out.println("Option 4: Exit");
                // Code to exit
                break;
            default:
                System.out.println("Invalid option selected! Please choose a valid option.");
                break;
        }
    }
}
