// source: leetcode problem - 442
// https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.*;

public class FindDuplicateElements {
     static List<Integer> duplicate(int[] arr){
        Set <Integer> set = new HashSet<>();
		List <Integer> list = new ArrayList<>();		
		for(int i=0;i<arr.length;i++){
		    if(set.contains(arr[i])){
		        list.add(arr[i]);
		    }
		    else{
		    set.add(arr[i]);
		        
		    }
		}
		return list;
    }
    
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
        System.out.println("Enter Array size:");
        int size = obj.nextInt();
	    int[] arr = new int[size];
        System.out.println("Enter Array Elements: ");
		for(int i=0;i<size;i++){
		    arr[i] = obj.nextInt();
		}
	    System.out.println(duplicate(arr));
	}
}
