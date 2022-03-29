 class Solution:
    def XXX(self, nums: List[int]) -> int:
        low, fast = 0, 0
        while fast < len(nums):
            if fast<len(nums)-1 and nums[fast + 1] == nums[fast]:
                fast += 1
            else:
                nums[low] = nums[fast]
                low += 1
                fast += 1
        return low

