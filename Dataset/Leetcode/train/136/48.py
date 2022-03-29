 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        return reduce(lambda i, j: i ^ j, nums)

