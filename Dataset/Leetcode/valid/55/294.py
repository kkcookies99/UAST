class Solution:
    def XXX(self, nums: List[int]) -> bool:
        n = len(nums)
        maxlen = 0
        i = 0
        while i <= maxlen:
            maxlen = max(maxlen, i+nums[i])
            i += 1
            if maxlen >= n-1:
                return True
        return False

