#User function Template for python3
class Solution:
    def upperBound(self, arr, target):
        #code here
        n=len(arr)
        low,high =0,n-1
        while low<=high:
            mid=(low+high)//2
            if arr[mid]<=target:
                ans=mid+1
                low=mid+1
            else:
                high=mid-1
        return ans