//source: leetcode problem-1572
//
import java.util.*;
public class MatrixDiagnolSum{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the matrix size:");
        int n = obj.nextInt();
        int [][] mat = new int[n][n];
        System.out.println("Enter matrix Elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(mat[i]));
        }
        
        System.out.println("The diagnol sum: "+diagonalSum(mat));
    }
     static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum=0;
        int mid=(n-1)/2;
        for(int i=0;i<n;i++){
            sum+= mat[i][i];
            sum+=mat[i][n-i-1];
        }
        if(n%2!=0){
            return sum-mat[mid][mid];
        }
        return sum;
        
    }
}