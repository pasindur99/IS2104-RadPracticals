import java.util.ArrayList;

public class Q4{
public static void main (String[] args){

	int[] arr = {1,4,4,4,3,4,1,5,7,6,5,4,7,8,2,1,1,5};

	ArrayList<Integer> array = new ArrayList<Integer>();
	
	for(int val :arr){
		array.add(val);
	}
	
	System.out.println("Array - " + array);
	System.out.println("Array length - " + array.size());
	System.out.println(" ");
	
	ArrayList<Integer> newArray = removeDuplicates(array);
	System.out.println("Array after remove duplicate elements- " + newArray);
	System.out.println("New array length - " + newArray.size());
	
}

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> array){
		
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		
		for(Integer val : array){
		
			if(!newArray.contains(val)){
				newArray.add(val);
			}
		}
		return newArray;
	
	}	

}
