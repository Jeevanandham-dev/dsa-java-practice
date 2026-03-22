//source: leetcode problem - 1365
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

import java.util.Arrays;
import java.util.Scanner;

public class NumbersSmallerThanCurrentElement {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int size = obj.nextInt();
        System.out.println("Enter Array Elements: ");
        int []nums = new int[size];
        for(int i=0;i<size;i++){
            nums[i] = obj.nextInt();
        }
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int []ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
        int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i] && j!=i){
                    count++;
                }
            }
                ans[i]=count;
        }
        return ans;
        
    }
}
