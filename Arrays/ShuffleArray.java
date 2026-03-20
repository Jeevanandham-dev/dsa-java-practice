//source: leetcode problem - 1470
// https://leetcode.com/problems/shuffle-the-array/

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int size = obj.nextInt();
        int [] nums = new int[size];
        System.out.println("Enter array elemts: ");
        for(int i =0;i<size;i++){
            nums[i]=obj.nextInt();
        }
        System.out.println("Enter shuffle point: ");
        int n = obj.nextInt();
        System.out.println(Arrays.toString(ArrayShuffle(nums,n)));

    }
    static int[] ArrayShuffle(int[]nums,int n){
        int [] ans = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            if(i%2==0){
                ans[i] = nums[i/2];
            }
            else{
                ans[i] = nums[n+(i/2)];
            }
        }
        return ans;
    } 
}
