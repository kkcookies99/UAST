class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        ans = [[]]
        for num in nums:
            for subset in ans:
                ans = ans + [[num] + subset]
        return ans

