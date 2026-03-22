//source: leetcode - 1431
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/



import java.util.*;

public class GreatestNumberOfCandies {
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter candy size: ");
    int size = obj.nextInt();
    System.out.println("Enter the candies as Array as the candy size:");
    int []candies = new int[size];
    for(int i=0;i<size;i++){
        candies[i] = obj.nextInt();
    }
    System.out.println("Enter count of Extracandies: ");
    int extra = obj.nextInt();
    System.out.println(GreatestNumber(candies, extra));
    }
    
    
    static List<Boolean>GreatestNumber(int[]candies,int extracandies){
        List<Boolean> result = new ArrayList<>();
        int max =0;
        for(int candy: candies){
            if(candy>max){
                max = candy;
            }
        }

        for(int candy: candies){
            if(candy+extracandies >=max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
    
}
