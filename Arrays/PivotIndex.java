//source: leetcode problem-724
//https://leetcode.com/problems/richest-customer-wealth/

import java.util.Scanner;

public class PivotIndex {

      static int pivotIndex(int[] nums) {
        int totsum=0;
        for(int sum: nums){
            totsum = totsum+sum;
        }
        int rsum = totsum;
        int lsum = 0;

        for(int i=0;i<nums.length;i++){
            rsum-=nums[i];
            if(lsum==rsum){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = obj.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        pivotIndex(arr);
    }
}
