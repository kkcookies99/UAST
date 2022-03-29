 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def helper(nums):
            if len(nums)==1:
                return [[nums[0]]]
            elif len(nums)==2:
                return [[nums[0],nums[1]],[nums[1],nums[0]]]
            n=len(nums)
            fir=nums[0]
            res=[]
            for i in helper(nums[1:]):
                for j in range(n):
                    res.append(i[:j]+[fir]+i[j:])
            return res
        return helper(nums)
