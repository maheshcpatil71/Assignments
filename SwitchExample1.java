package looping;

	public class SwitchExample1 {
		
	    public static void main(String[] args) {
	    	
	        String trafficLight = "Green";

	        switch (trafficLight) {
	            case "Red":
	                System.out.println("Stop!");
	                break;
	            case "Yellow":
	                System.out.println("Slow down!");
	                break;
	            case "Green":
	                System.out.println("Go!");
	                break;
	            default:
	                System.out.println("Invalid traffic light signal!");
	                break;
	        }
	    }
	}

