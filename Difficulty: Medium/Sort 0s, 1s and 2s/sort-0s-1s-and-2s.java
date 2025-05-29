class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] nums) {
        // code herew
        int zer=0,one=0,two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zer++;
            else if(nums[i]==1) one++;
            else two++;
        }
        for(int i=0;i<zer;i++){
            nums[i]=0;
        }
        for(int i=zer;i<one+zer;i++){
            nums[i]=1;
        }
        for(int i=zer+one;i<one+two+zer;i++){
            nums[i]=2;
        }
    }
}
