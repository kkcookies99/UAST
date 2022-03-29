 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        if (len(nums) == 0): return False
        if (len(nums) == 1): return True
        i = len(nums) - 2
        last = len(nums) - 1
        while (i >= 0):
            if (nums[i] >= last - i): last = i
            i = i - 1
        return last == 0

