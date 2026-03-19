import java.util.*;
public class ArrayPassingInFunction {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        ArrayPassing(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void ArrayPassing(int[]nums){
        nums[0]=90;
    }
}
