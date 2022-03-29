 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        last = 0
        n = len(nums)
        i = 0
        while i <= last:
            if i + nums[i] >= last:
                last = i + nums[i]
                if last >= n - 1:
                    return True
            i += 1
        return False

