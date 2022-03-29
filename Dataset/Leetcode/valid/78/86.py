class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        return [list(filter(lambda x: subArray[nums.index(x)]==1,nums)) for subArray in [[int(_) for _ in bin(i)[2:].zfill(len(nums))] for i in range(2**len(nums))]]

