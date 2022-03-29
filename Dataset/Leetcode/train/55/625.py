 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        n = len(nums)
        f = [False] * n

        f[0] = True
        for i in range(n):
            for j in range(i):
                f[i] |=  f[j] and (i - j) <= nums[j]
        
        return f[n - 1];
                

