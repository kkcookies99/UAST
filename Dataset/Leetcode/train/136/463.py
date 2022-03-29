 class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = 0
        #print(nums)
        nums.sort()
        #print(nums)
        for i in range(len(nums)):
            if i%2 == 0:
                res+=nums[i]
            elif i%2 == 1:
                res-=nums[i]

        return res

