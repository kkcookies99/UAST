class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        return [[nums[j] for j in range(len(nums)) if i&2**j] for i in range(2**len(nums))]

