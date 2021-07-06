public class Q1{
public static void main (String[] args){

	for(int i =1000; i<=1250; i++){
		int p_num = i;
		int s_num = i;
		int sum=0;
		int product = 1;
		int modules = 0;
		
		for(int j=0;j<4;j++){
			int last = (s_num % 10);
			sum += last;
			s_num /=10;
		}
		
		for(int j =1;j<4;j++){
			int last = (p_num % 10);
			if (last !=0){
				product *= last;
			}
			p_num /=10;
			
			modules = i %5;
			
			if (product == 6 && sum == 7 && modules ==3){
				System.out.println("The number between 1000 and 1250 with conditions is : " +i);
			}
		}
	
	}

}

}
