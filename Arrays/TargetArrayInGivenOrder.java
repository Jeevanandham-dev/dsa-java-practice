//source: leetcode problem - 1389
//https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.*;

public class TargetArrayInGivenOrder {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int size = obj.nextInt();
        int [] arr = new int[size];
        int[]index = new int[size];
        System.out.println("Enter value Array: ");
        for(int i=0;i<size;i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("Enter index Array: ");
        for(int i=0;i<size;i++){
            index[i] = obj.nextInt();
        }
        System.out.println(Arrays.toString(createTargetArray(arr,index)));
        
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        List <Integer> targetList = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            targetList.add(index[i], nums[i]);
        }

        int[] target = new int[targetList.size()];
        for (int i = 0; i < targetList.size(); i++) {
            target[i] = targetList.get(i);
        }
        return target;
    }
}
