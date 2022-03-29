class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        return [[n] + sub for i, n in enumerate(nums) for sub in self.XXX(nums[:i] + nums[i+1:])] or [nums]

