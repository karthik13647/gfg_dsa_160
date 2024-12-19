//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    public ArrayList<Integer> spirallyTraverse(int arr[][]) {
        ArrayList<Integer> list = new ArrayList<>();
        
        if (arr == null || arr.length == 0) {
            return list;
        }

        int top = 0;
        int left = 0;
        int bottom = arr.length - 1;
        int right = arr[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(arr[top][i]);
            }
            top++; 

            for (int i = top; i <= bottom; i++) {
                list.add(arr[i][right]);
            }
            right--; // Move right boundary left

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(arr[bottom][i]);
                }
                bottom--; // Move bottom boundary up
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(arr[i][left]);
                }
                left++; // Move left boundary right
            }
        }
        return list;
    }
}