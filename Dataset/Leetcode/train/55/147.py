class Solution:
    def XXX(self, nums: List[int]) -> bool:
        l = len(nums)
        start = l-1
        end = 1
        for index in range(1,l):
            val = nums[start - index]
            if val >= end:
                end = 1
            else:
                end += 1
        return end == 1

