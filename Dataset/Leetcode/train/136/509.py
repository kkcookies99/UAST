 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        from collections import Counter
        return Counter(nums).most_common()[-1][0]

