import java.util.*;

public class Q5 {
public static void main (String[] args)
	{
	
	Scanner scan = new Scanner(System.in);

	System.out.println("Input an integer between 0 and 1000:");
	int number = scan.nextInt();
	
	
	int length = String.valueOf(number).length();
	int sum = 1;
	int last;
	int display = number;

	for(int i=0; i<length; i++)
		{
			last = (number % 10);
			number /= 10;
			sum = sum*last;
		}
			System.out.println("The multipication of all digits in " + display + " is " +sum);
	}
}