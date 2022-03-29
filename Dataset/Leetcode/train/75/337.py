class Solution:
    def XXX(self, nums: List[int]) -> None:
        n = len(nums)
        i, l, r = 0, 0, n - 1
        while i < n:
            if l < i and nums[i] == 0:
                nums[l], nums[i] = nums[i], nums[l]
                l += 1
            elif r > i and nums[i] == 2:
                nums[r], nums[i] = nums[i], nums[r]
                r -= 1
            else:
                i += 1

