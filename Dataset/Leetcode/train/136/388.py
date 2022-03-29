 class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans = []
        for i in range(len(nums)):
            if nums[i] not in ans:
                ans.append(nums[i])
            else:
                ans.remove(nums[i])
        return ans.pop()

