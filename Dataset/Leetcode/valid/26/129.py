 class Solution:
    def XXX(self, nums: List[int]) -> int:
        p = 0
        while p < len(nums) - 1:
            if nums[p + 1] == nums[p]:
                nums.pop(p + 1)
            else:
                p += 1

        return len(nums)


