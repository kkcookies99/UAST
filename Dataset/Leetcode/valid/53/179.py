class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if nums == None or len(nums) == 0:
            return 0
        
        maxsum = nums[0]
        tempsum = 0
        for num in nums:
            tempsum += num
            if tempsum < num:
                tempsum = num
            if maxsum < tempsum:
                maxsum = tempsum
                
        return maxsum
                

