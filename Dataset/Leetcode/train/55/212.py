class Solution:
    def XXX(self, nums: List[int]) -> bool:
        l=len(nums)-1
        for i in range(l,-1,-1):
            if nums[i]>=l-i:
                l=i
        return True if l==0 else False
       

