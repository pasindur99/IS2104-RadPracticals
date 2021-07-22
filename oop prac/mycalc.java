import java.util.Scanner;

public class mycalc {

    public int add (int x, int y){
        return x + y;
    }

    public int subtract (int x, int y){
        return x - y;
    }

    public double divide (int x, int y){
        return x / y ;
    }

    public int multiply (int x, int y){
        return x * y ;
    }

    public static void main(String[] args){

        mycalc cal = new mycalc();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number - ");
        int num1 = scan.nextInt();
        System.out.print("Enter Second first number - ");
        int num2 = scan.nextInt();

        System.out.println("Addition - "+cal.add( num1,num2));
        System.out.println("sub - "+cal.subtract( num1,num2));
        System.out.println("div - "+cal.divide( num1,num2));
        System.out.println("mul - "+cal.multiply( num1,num2));
    }

}

