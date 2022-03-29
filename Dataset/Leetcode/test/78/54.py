class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        ans = [[]]
        for e in nums:
            ans = ans + [[e] + x for x in ans] 
        return ans

