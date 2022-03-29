 class Solution:
    def XXX(self, nums, target):
        d={}
        for i in range(len(nums)):
            c = target - nums[i]
            if c in d.keys():
                return i,d[c]
            d[nums[i]] = i
        return None

