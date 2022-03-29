 class Solution:
    def XXX(self, nums: List[int]) -> int:
        j=len(nums)
        for i in range(1, j):
            if nums[i]==nums[i-1]:
                nums.pop(i)
        return len(nums)

