class Solution:
    def XXX(self, nums: List[int]) -> bool:
        n = len(nums)-2
        if n == -1:
            return True
        k = n+1
        while n >= 0:
            if nums[n]+n >= k:
                k = n
            n -= 1
        return k == 0

