 class Solution:
    def XXX(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        i = 1
        for l in range(1, len(nums)):
            if nums[l] == nums[l-1]:
                pass
            else:
                nums[i] = nums[l]
                i = i+1
        return i;

