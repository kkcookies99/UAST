 def singleNumber(self, nums: List[int]) -> int:
        numset = set(nums)
        return sum(numset) * 2 - sum(nums)

