 class Solution:
    def XXX(self, nums: List[int]) -> int:
        prev = 0
        ans = -float("inf")
        for num in nums:
            prev = max(prev, 0)+num
            ans = max(ans, prev)
        
        return ans


