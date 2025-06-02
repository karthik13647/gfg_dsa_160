class Solution:
    def countFreq(self, arr, target):
        #code here
        def lowerbound(arr,target):
            low=0
            high=len(arr)-1
            a=-1
            while low<=high:
                mid=low+(high-low)//2
                if arr[mid]<=target:
                    if arr[mid]==target:
                        a=mid
                    low=mid+1
                else:
                    high=mid-1
            return a
        
        def upperbound(arr,target):
            low=0
            high=len(arr)-1
            b=-1
            while low<=high:
                mid=low+(high-low)//2
                if arr[mid]>=target:
                    if arr[mid]==target:
                        b=mid
                    high=mid-1
                else:
                    low=mid+1
            return b
        a=lowerbound(arr,target)
        b=upperbound(arr,target)
        if a==-1 or b==-1:
            return 0
        return a-b+1
        
## here i reverse the lower bound and upper bounds