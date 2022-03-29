 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        N = Counter(nums)
        for i in list(N.keys()):
            if N[i] == 1:
                return i 

