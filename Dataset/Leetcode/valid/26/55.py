 class Solution:
    def XXX(self, nums: List[int]) -> int:
        l=len(nums)
        ans=0
        i=0
        while 1:
            if (nums[ans]==nums[i+1]):
                i+=1
            else:
                nums[ans+1]=nums[i+1]
                i+=1
                ans+=1
            if i>l-2:
                break
        return ans+1


