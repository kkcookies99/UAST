 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        res = 0

        while nums:
            res ^= nums[-1]
            nums.pop()

        return res

