class Solution:
    def maxSubarraySum(self, arr):
        # Code here\
        s=arr[0]
        m=arr[0]
        for i in range(1,len(arr)):
            s=max(s+arr[i],arr[i])
            m=max(m,s)
        return m