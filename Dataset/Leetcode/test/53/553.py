 class Solution:
    def XXX(self, nums: List[int]) -> int:
        smax=[nums[0]]
        i=1
        while(i<=len(nums)-1):
            smax.append(max(smax[i-1]+nums[i],nums[i]))
            i+=1
        return max(smax)

