//source: leetcode problem 1480
// https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
    System.out.println("Enter Array size: ");
        int size = obj.nextInt();
        int []nums = new int[size];
        for(int i=0;i<size;i++){
            nums[i]=obj.nextInt();
        }
        System.out.println(Arrays.toString(runningsum(nums)));
        
    }

    static int[] runningsum(int[]nums){
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
    
    
}
