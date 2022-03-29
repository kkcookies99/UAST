 class Solution:
    def XXX(self, nums: List[int]) -> int:
        nums[0:len(set(nums))]=sorted(list(set(nums)))
        return len(set(nums))

