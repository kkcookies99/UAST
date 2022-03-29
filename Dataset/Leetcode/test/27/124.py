 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        l=len(nums)-1
        while l>=0:
            if nums[l]==val:
                del nums[l]
            l-=1
        return len(nums)

