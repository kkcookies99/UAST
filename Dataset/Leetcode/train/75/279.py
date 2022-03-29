class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        p0, p1 = 0, 0
        for i in range(len(nums)):
            cache = nums[i]
            nums[i] = 12
            if cache < 12:
                nums[p0] -= 6
                p0 += 1
            if cache < 6:
                nums[p1] -= 1
                p1 += 1

