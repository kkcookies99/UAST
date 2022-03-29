 class Solution:
    def XXX(self, nums, target):
        res = {}
        for i in range(len(nums)):
            if nums[i] in res.keys():
                return [res[nums[i]], i]
            else:
                res[target - nums[i]]= i
        return [None,None]
        

