 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        import collections
        b = collections.Counter(nums)
        if 1 in b.values():
	        return list(b.keys())[list(b.values()).index(1)]

