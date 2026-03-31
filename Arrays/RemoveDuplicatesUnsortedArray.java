// works for sorted array too
import java.util.*;

public class RemoveDuplicatesUnsortedArray {
    static int[] removeduplicates(int[] arr,int size){
     //creating LinkedHashSet because it does not allow duplicates
		Set<Integer> set = new LinkedHashSet<>();
		for(int i=0;i<size;i++){
		    set.add(arr[i]);
		}
		int[] unique = new int[set.size()];
        int i=0;
		for(int num: set){
		    unique[i++]=num;
		}
		return unique;

}
public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        //array creation
        System.out.println("Enter array Size: ");
        int size = obj.nextInt();
		int [] arr = new int[size];
        System.out.println("Enter Array elements: ");
        // geting array inputs
		for(int i=0;i<size;i++){
		    arr[i]=obj.nextInt();
		}
        obj.close();
        System.out.println("Duplicate elements removed Array: "+Arrays.toString(removeduplicates(arr,size)));
	}
    
}
