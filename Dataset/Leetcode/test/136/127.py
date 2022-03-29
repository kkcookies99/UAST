 class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = nums[::]
        for i in set(nums):
            nums.remove(i)

        for j in n:
            if j not in nums:
                return j
        

