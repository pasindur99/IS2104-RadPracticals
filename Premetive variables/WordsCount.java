import java.util.*;

public class WordsCount{

    	public static void main(String[] args){       
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter Your sentence below : ");
        	String str = sc.nextLine();

        	String[] array = str.split(" ");
        
		ArrayList<Integer> words = new ArrayList<>();
	
		for(int i=0; i<array.length; i++){
			if(words.contains(i)){
			continue;
			}
			int count = 1;
			for(int j=i+1; j<array.length; j++){
				if (array[i].equals(array[j])){
				count ++;
				words.add(j);
				}
			}
            		System.out.println(array[i]+"  --  " + count);
		}
	}

/*UCSC offers Computer Science and Software Engineering education under the Bachelor of Computer Science and Information Systems under Bachelor of Information Systems intakes through the University Grants Commission as internal students such as Bachelor of Science in Computer Science, Bachelor of Science in Information Systems, Bachelor of Science Honours in Computer Science, Bachelor of Science Honours in Software Engineering, Bachelor of Science Honours in Information Systems*/
}




