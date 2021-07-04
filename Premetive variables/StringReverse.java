import java.util.*;
import java.io.*;

public class StringReverse{

    	public static void main(String[] args){       
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter Your sentence below : ");
        	String str = sc.nextLine();

        	char[] reverse = str.toCharArray();
        
		System.out.println("\nReversed sentence = ");
		for(int i = reverse.length-1; i>=0; i--){
			
            		System.out.print(reverse[i]);
		}
	}

/*
The allegory of the cave, or Plato's Cave, was presented by the Greek philosopher Plato in his work Republic to compare "the effect of education and the lack of it on our nature". It is written as a dialogue between Plato's brother Glaucon and his mentor Socrates, narrated by the latter.
*/
}




