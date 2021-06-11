import java.util.*;

public class Calc {
public static void main (String[] args)
{
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter your First number (A) - ");
	int A = sc.nextInt();

	System.out.println("Enter your Second number (B) - ");
	int B = sc.nextInt();

	int sum = A+B;
	int sub = A-B;
	float mul = A*B;
	float div = A/B;

	System.out.println("A+B - "+ sum);
	System.out.println("A-B - "+ sub);
	System.out.println("A*B - "+ mul);
	System.out.println("A/B - "+ div);

}
}