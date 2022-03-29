 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        lens = len(nums)
        i, j = -1, lens
        while i < j-1:
            mid = nums[(i+j)//2]
            if mid == target:
                return (i+j)//2
            elif mid < target:
                i = (i+j)//2
            else:
                j = (i+j)//2
        return j

