class Solution:
    def XXX(self, nums):
        max_jump = 0
        for index, num in enumerate(nums):
            if index == len(nums) - 1:
                return True
            max_jump = max(max_jump - 1, num)
            if max_jump <= 0:
                return False
        return True