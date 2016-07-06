//must have this when using scanner functionality
import java.util.Scanner;

public class Reversal {
//main method
	public static void main(String[] args) {
		//create scanner object - not sure I entirely understnd this part yet
		Scanner input = new Scanner(System.in);
		
		int n, reverse = 0;
		
		//display user prompt
		System.out.println("Please enter a whole number and press the 'Enter/Return' key.");
		
		//wait for input from user
		n= input.nextInt();
		
		//crazy math that I think I understand!
		while(n !=0)
		{
			reverse = reverse * 10;
			reverse = reverse + n%10;
			n = n/10;
		}
		//tell the user the reverse of their input
		System.out.println("The reverse of the number you entered is: " + reverse + ".");
	}

}
//sweet baby jesus, it all worked!!! :)