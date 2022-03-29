 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        l=len(nums)
        a=0
        for i in range(1,l):
            if nums[i-a]==nums[i-a-1]:
                nums.pop(i-a)
                a+=1
        return len(nums)

