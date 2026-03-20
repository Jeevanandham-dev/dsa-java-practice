//source: leetcode problem-1672
// https://leetcode.com/problems/richest-customer-wealth/

import java.util.Scanner;
import java.util.Arrays;
public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter row size: ");
        int row = obj.nextInt();
        System.out.println("Enter column size: ");
        int col = obj.nextInt();
        int[][] nums = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                nums[i][j]=obj.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            System.out.println(Arrays.toString(nums[i]));
        }
        System.out.println(MaxCustomer(nums));
        

    }
    static int MaxCustomer(int[][]nums){
        int max=0;
        for(int i=0;i<nums.length;i++){
        int sum=0;
            for(int j=0;j<nums[i].length;j++){
                sum=sum+nums[i][j];
            }
            if(sum>max || sum==max){
                max=sum;
            }
        }
        return max;
    }
}
