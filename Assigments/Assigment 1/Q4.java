import java.util.*;

public class Q4 {
public static void main (String[] args)
	{
	
	Scanner scan = new Scanner(System.in);

	System.out.println("Input mass in kg :");
	double m = scan.nextFloat();

	System.out.println("Input speed in ms^-1 :");
	double v = scan.nextFloat();

	double E = 0.5 * m * (v*v);
	System.out.println("Kinertic Energy: "+ E + "J");
	
	int val = (int) (E+0.5);
	System.out.println("Kinertic Energy to nearest integer: "+ val+ "J");

	}
}