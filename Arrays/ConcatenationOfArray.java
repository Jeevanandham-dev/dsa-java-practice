//source: leetcode problem - 1929
//https://leetcode.com/problems/concatenation-of-array/
import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = obj.nextInt();
        int []nums = new int[size];
        for(int i=0;i<size;i++){
            nums[i]=obj.nextInt();
        }
        System.out.println(Arrays.toString(ConcatArray(nums)));
    }

    static int[] ConcatArray(int[]nums){
        int [] ans = new int[nums.length*2];
        for(int i = 0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;

    }
}