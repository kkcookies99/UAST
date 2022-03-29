 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def XXX(nums,start,target):#两数之和
            lo = start
            hi = len(nums)-1
            restwo = []
            while lo<hi:
                left = nums[lo]
                right = nums[hi]
                if nums[lo]+nums[hi]>target:
                    hi-=1
                elif nums[lo]+nums[hi]<target:
                    lo+=1
                else:
                    restwo.append([nums[lo],nums[hi]])
                    while lo<hi and nums[lo]==left:
                        lo+=1
                    while lo<hi and nums[hi]==right:
                        hi-=1    
            return restwo

        nums.sort()
        res = []
        n = len(nums)
        if n<3:
            return []
        for i in range(n-2):
            tuples = XXX(nums,i+1,-nums[i])
            for tu in tuples:
                tu.append(nums[i])
                res.append(tu)
            while i<n-1 and nums[i]==nums[i+1]:
                i+=1
        return res

