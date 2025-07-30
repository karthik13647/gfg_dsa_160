class Solution:
    def leaders(self, arr):
        # code here
        n=len(arr)
        ele=arr[n-1]
        a=[ele]
        
        for i in range(n-2,-1,-1):
            if ele<=arr[i]:
                a.append(arr[i])
                ele=arr[i]
        # b=a.reverse()
        return a[::-1]