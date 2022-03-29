 class Solution(object):
    def XXX(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        for item in nums:
            if item == val:
                nums.remove(item)
        return len(nums)

if __name__=="main":
    solution = Solution()
    solution.XXX()

