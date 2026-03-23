import java.util.*;
public class FindHighestAltitude{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = obj.nextInt();
        System.out.println("Enter Array Elements: ");
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("The Highest altitude: ");
        System.out.print(largestAltitude(arr));


        
    }

    static int largestAltitude(int[] gain) {
        int sum=0;
        int max=0;
        for(int alt : gain){
            sum+=alt;
            if(sum>max){
                max=sum;
            }
        }
        return max;
        
    }
}