class Solution:
	def twoSum(self, arr, target):
		# code here
		dict={}
		for key,ele in enumerate(arr):
		  #  print(key,ele)
		    b=target-ele
		    if b in dict:
		        return True
		    dict[ele]=key
		return False