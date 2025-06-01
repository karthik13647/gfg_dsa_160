#User function Template for python3
class Solution:
    def lowerBound(self, arr, target):
        #code here
        n=len(arr)
        ans=n
        low,high=0,n-1
        while low<=high:
            mid=(low+high)//2
            if arr[mid]<target:
                low=mid+1
            else:
                ans=mid
                high=mid-1
        return ans