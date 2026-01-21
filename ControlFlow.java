package div1;

public class ControlFlow {

	public static void main(String[] args) {
        char ch = '9';
        if (Character.isAlphabetic(ch)) {
        	System.out.println("Alphabet");
        	
        }else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        	
        }else {
            System.out.println("Special Character");
        }
    }
}
