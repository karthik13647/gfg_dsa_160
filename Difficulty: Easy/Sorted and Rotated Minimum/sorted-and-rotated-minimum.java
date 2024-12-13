//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        Solution ob = new Solution(); // Instantiate the Solution object once

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] elements = line.split(" ");
            int[] arr = new int[elements.length]; // Changed to int[]

            for (int i = 0; i < elements.length; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            System.out.println(ob.findMin(arr));
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int low=0;
        int high=arr.length-1;
        int n=arr.length;
        while(low<high){
            int mid=low+(high-low)/2;
            if(mid>0 && arr[mid-1]>arr[mid]) return arr[mid];
            else if(mid+1<n && arr[mid]>arr[mid+1]) return arr[mid+1];
            else if(arr[mid]>arr[high]) low=mid+1;
            else high=mid-1;
        }
        return arr[low];
    }
}
