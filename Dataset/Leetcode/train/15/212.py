 class Solution:
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        res =[]
        if len(nums)<3 or nums[0]>0 or nums[-1]<0:
            return res
        for i in range(len(nums)):
            if i == 0 or nums[i]>nums[i-1]:
                l = i+1
                r = len(nums)-1
                while l < r and nums[i]<=0 and nums[r]>=0:
                    s = nums[i] + nums[l] +nums[r]
                    if s ==0:
                        res.append([nums[i],nums[l],nums[r]])
                        l +=1
                        r -=1
                        while l < r and nums[l] == nums[l-1]:
                            l += 1
                        while r > l and nums[r] == nums[r+1]:
                            r -= 1
                    elif s>0:
                        r -=1
                    else :
                        l +=1
        return res

