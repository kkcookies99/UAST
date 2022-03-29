 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        from collections import Counter
        d = Counter(nums)
        return min(d,key=d.get)

