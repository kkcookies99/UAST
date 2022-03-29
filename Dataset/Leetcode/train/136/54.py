 class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        for i in range(len(nums)//2+1):
            n = nums.pop()
            if n in nums:
                nums.remove(n)
            else:
                return n

