class Solution:
    def XXX(self, nums: List[int]) -> bool:
        length = len(nums)
        end = nums[0]
        for i in range(1, length-1):
            if i + nums[i] > end and i<=end:
                end = i + nums[i]
        return end >= length-1

