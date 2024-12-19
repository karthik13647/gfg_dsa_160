//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine().trim());

            String[] line1 = br.readLine().trim().split(" ");
            int[] a = new int[line1.length];
            for (int i = 0; i < line1.length; i++) {
                a[i] = Integer.parseInt(line1[i]);
            }

            String[] line2 = br.readLine().trim().split(" ");
            int[] b = new int[line2.length];
            for (int i = 0; i < line2.length; i++) {
                b[i] = Integer.parseInt(line2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.kthElement(a, b, k));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int kthElement(int a[], int b[], int target) {
        // code here
        int i=0;
        int j=0;
        int k=0;
        int ele=0;
        while(i<a.length && j<b.length){
            if(a[i]>=b[j]){
                ele=b[j];
                j++;
            }
            else{
                ele=a[i];
                i++;
            }
            k++;
            if(k==target) return ele;
        }
        while(i<a.length){
            ele=a[i];
            k++;
            i++;
            
            if(k==target) return ele;
        }
        while(j<b.length){
            ele=b[j];
            k++;
            j++;
            
            if(k==target) return ele;
        }
        return 0;
    }
}