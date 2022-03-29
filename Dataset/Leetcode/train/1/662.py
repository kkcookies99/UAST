 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(0,len(nums)):
            target=target-nums[i]
            for j in range(i+1,len(nums)):
                if(nums[j]==target):return (i,j)
            target=target+nums[i]
                

