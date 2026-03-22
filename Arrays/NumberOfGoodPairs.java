//source: leetcode problem - 1512
//https://leetcode.com/problems/number-of-good-pairs/

import java.util.Scanner;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter Array size: ");
    int size = obj.nextInt();
    System.out.println("Enter the Array elements as the size: ");
    int []num = new int[size];
    for(int i=0;i<size;i++){
        num[i] = obj.nextInt();
    }
    
    System.out.println(GoodPairs(num));
    }

    static int GoodPairs(int []nums){
        int count=0;
        for(int i=0; i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    count++;
                }
            }
        }
        return count;
    }
}
