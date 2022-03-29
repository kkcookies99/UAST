class Solution:
    def XXX(self, nums):
        if not nums:
            return [[]]
        else:
            fisrt_element = [nums[0]]
            nums.pop(0)
            sub = self.XXX(nums)
            out = [(fisrt_element + s) for s in sub] + sub
            return out
