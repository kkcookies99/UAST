 class Solution:
    def XXX(self, nums):
        if(nums==[]):
            return 0
        
        a=nums[0]
        p=0
        while(p<len(nums)-1):
            while((nums[p+1]==a)):
                del nums[p+1]
                if(p+1==len(nums)):
                  break

            p=p+1
            if (p == len(nums)):
                break
            a = nums[p]
        return len(nums)

