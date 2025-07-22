from collections import Counter
class Solution:
    def removeDuplicates(self, arr):
        # code here 
        l=[]
        cnt=Counter(arr)
        for key,ele in cnt.items():
            l.append(key)
        return l