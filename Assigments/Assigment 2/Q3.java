public class Q3{
public static void main (String[] args){

	for(int i=0;i<10;i++){
		if(i<5){
			for (int k=0;k<i;k++){
				System.out.print(" ");
			}
			for (int j =i; j<5;j++){
					System.out.print("* ");
			}
			System.out.print("\n");
		}else{
			for( int k =i; k<9;k++){
				System.out.print(" ");			
			}
			for (int j =5; j<=i; j++){
					System.out.print("* ");		
			}
			System.out.print("\n");
		}
		
	}
}	

}
