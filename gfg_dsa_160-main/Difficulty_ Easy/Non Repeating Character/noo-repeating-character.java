import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String st = sc.next();

            char ans = new Solution().nonRepeatingChar(st);

            if (ans != '$')
                System.out.println(ans);
            else
                System.out.println(-1);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ele:s.toCharArray()){
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }
        for(char ele:s.toCharArray()){
            if(hm.get(ele)==1) return ele;
        }
        return '$';
    }
}
