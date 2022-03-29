 def singleNumber(self, nums: List[int]) -> int:
    tmp = 0
    for v in nums:
        tmp ^= v
    return tmp

