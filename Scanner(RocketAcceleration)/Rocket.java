import java.util.*;

public class Rocket {
public static void main (String[] args)
{
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the total mass-");
	float m = sc.nextFloat();

	System.out.println("Enter the totla thrust-");
	float t = sc.nextFloat();

	float w = m * (float)9.8;
	float f=t-w;
	float a = f/m;

	System.out.println("Acceleration is : "+ a + "ms^(-2)");

}
}