//source: leetcode problem - 1920
// https://leetcode.com/problems/build-array-from-permutation/


import java.util.*;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int []nums = new int[size];
        for(int i= 0; i <= size-1; i++){
            nums[i]= obj.nextInt();
            if(nums[i] < 0 || nums[i] >= size){
                System.out.println("Invalid input");
                return;
            }
        }
        ArrayPermutation(nums);

    }
    static void ArrayPermutation(int []nums){
        int []ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        
        System.out.println(Arrays.toString(ans));

    }
}
