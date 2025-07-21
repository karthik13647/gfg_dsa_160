class Solution:
    def isSorted(self, arr) -> bool:
        # code here
        if len(arr)==1:
            return True
        for i in range(1,len(arr)):
            if arr[i]<arr[i-1]:
                return False
        else:
            return True