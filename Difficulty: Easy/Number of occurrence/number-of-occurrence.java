//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {

    public static int firstOccurrence(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                ans = mid;
                e = mid - 1; // first occurrence
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ans;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                ans = mid;
                s = mid + 1; // last occurrence
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ans;
    }

    public static int countFreq(int[] arr, int target) {
        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        if (first == -1 || last == -1) {
            return 0;
        }

        return last - first + 1;
    }
}
