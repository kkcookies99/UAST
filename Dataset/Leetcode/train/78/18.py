class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        return [[]] + sum([[[num] + subset for subset in self.XXX(nums[i + 1:])] for i, num in enumerate(nums)], [])

