class Solution:    
    def findUnion(self, a, b):
        # code here
        a=a+b
        return sorted(set(a))