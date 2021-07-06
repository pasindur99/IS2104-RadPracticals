

public class Q2{
public static void main (String[] args){

	int number;
	int upperBound = 0;
	int lowerBound = 100;
	for(int j=1;j<=10;j++){
		number = lowerBound + (int) (Math.random() * ((upperBound - lowerBound) +1));
		int length = String.valueOf(number).length();
		
		if(number % 2 ==0){
			System.out.println("Your " + j+" number is "  +number+ "and it is an Even numbber");
		}else{
			System.out.println("Your " + j+" number is "  +number+ "and it is an Odd numbber");
		}
		
		boolean flag = false;
		for(int i = 2; i<=number /2; i++){
			if(number % i == 0 ){
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println("And your number is a prime number");
		else
			System.out.println("And your number is not a prime number");
			
		
		System.out.println(" ");
	}
}

}
