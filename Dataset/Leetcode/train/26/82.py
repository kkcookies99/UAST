 class Solution:
    def XXX(self, nums: List[int]) -> int:
        j = 0
        for i in range(1, len(nums)):
            if nums[i] != nums[j]:
                j += 1
                nums[i], nums[j] = nums[j], nums[i]
        return j + 1

