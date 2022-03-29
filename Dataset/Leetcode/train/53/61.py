class Solution:
    def XXX(self, nums: List[int]) -> int:
        return max(itertools.accumulate(nums,lambda a,b:b+max(a,0)))

