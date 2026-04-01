//source: leetcode problem-118
//https://leetcode.com/problems/pascals-triangle


import java.util.*;

public class PascalTriangle {
    static List<List<Integer>> pascal(int rownum){
        List<List<Integer>> triangle = new ArrayList<>();
        // First row is always [1]
        List<Integer> row = new ArrayList<>();
        row.add(1);
        triangle.add(row);
        for (int i = 1; i < rownum; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1); // first element is always 1
            // middle elements
            for (int j = 1; j < row.size(); j++) {
                newRow.add(row.get(j - 1) + row.get(j));
            }
            newRow.add(1); // last element is always 1
            triangle.add(newRow); // ✅ add each row to triangle
            row = newRow; // move to next row
        }
        return triangle;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter row Number of the pascal triangle to be printed: ");
        int row = obj.nextInt();
        System.out.println(pascal(row));
    }
}
