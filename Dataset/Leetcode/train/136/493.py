 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        temp=collections.Counter(nums)
        for value,key in temp.items():
            if key==1:return value

