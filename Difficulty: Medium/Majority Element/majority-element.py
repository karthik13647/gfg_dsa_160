class Solution:
    def majorityElement(self, arr):
        # Initialize the count to 0 and the candidate to None
        cnt = 0
        key = None

        # Traverse the array and update the count and candidate
        for ele in arr:
            if cnt == 0:
                cnt += 1
                key = ele
            elif key == ele:
                cnt += 1
            else:
                cnt -= 1

        # Verify if the candidate is indeed the majority element
        cnt1 = 0
        for i in arr:
            if i == key:
                cnt1 += 1

        if cnt1 > len(arr) // 2:
            return key
        return -1