#User function Template for python3

class Solution:
    def findOnce(self,nums):
        # Complete this function
        
        low,high=0,len(nums)-1
        
        while low<high:
            mid=low+(high-low)//2
            
            if mid%2==0 and nums[mid]==nums[mid+1] or mid%2!=0 and nums[mid]==nums[mid-1]:
                low=mid+1
            else:
                high=mid
                
        return nums[low]