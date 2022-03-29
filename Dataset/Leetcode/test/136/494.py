 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        xor = 1
        for i in nums:
            xor^=i 
        return xor^1

