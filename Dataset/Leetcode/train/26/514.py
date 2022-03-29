 class Solution:
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        for index in range(len(nums)):
	        for i in range(index+1,len(nums)):
		        if nums[index] == nums[i] and nums[index]!=None and nums[i]!=None:
			        nums[i] = None
        count = 0
        for item in nums:
	        if item == None:
		        count+=1
        for i in range(count):
	        nums.remove(None)
        return(len(nums))

