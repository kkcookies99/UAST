 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        l=len(nums)
        for i in range(l):
            if nums[i]==target: 
                return i 
                break
            elif nums[i]>target:
                return i
                break
            elif i ==l-1:
                return i+1 
                break

