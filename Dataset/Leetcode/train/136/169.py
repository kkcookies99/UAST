 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        ans = 0
        for s in nums:
            ans = ans ^ s
        return ans

