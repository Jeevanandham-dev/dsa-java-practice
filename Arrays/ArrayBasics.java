import java.util.*;
 class Arraybasics {
    public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = obj.nextInt();
        }
        // for(int num : arr){
        //     System.out.print(num + " ");
        // }
        System.out.println(Arrays.toString(arr));
    }
    
}
