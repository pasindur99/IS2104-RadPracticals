import java.util.*;

public class Q3 {
public static void main (String[] args)
{
	
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter your number - ");
	int n = scan.nextInt();

	for (int i=1; i<=10; i++)
	{
		int product = i*n;
		System.out.println(n + "*" + i + "=" + i*n);

	}
}
}