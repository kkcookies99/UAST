 class Solution:
    def XXX(self, nums: List[int]) -> int:
        for i in range(len(nums) - 1, 0, -1):
            if nums[i - 1] == nums[i]:
                del nums[i]
        return len(nums)

