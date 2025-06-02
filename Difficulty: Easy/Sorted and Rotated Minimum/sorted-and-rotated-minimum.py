#User function Template for python3

class Solution:
    def findMin(self, nums):
        #complete the function here
        low,high=0,len(nums)-1
        while(low<high):
            mid=low+(high-low)//2
            if nums[mid]>nums[high]:
                low=mid+1
            else:
                high=mid
        return nums[low]