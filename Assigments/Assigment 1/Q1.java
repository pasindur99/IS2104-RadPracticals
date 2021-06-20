import java.util.*;

public class Q1 {
public static void main (String[] args)
	{
	
	Scanner scan = new Scanner(System.in);

	double PI = 3.14;

	System.out.println("Enter the Radius -");
	double r = scan.nextDouble();

	double p = 2 * PI *r;

	System.out.println("Perimeter is -"+ p);

	}
}