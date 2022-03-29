 class Solution(object):
    def XXX(self, nums, target):
        c ={}
        for i in range(len(nums)):
            if nums[i] not in c:
                c[nums[i]]= i 
            if target-nums[i] in c and i != c[target-nums[i]]:
                return [i,c[target-nums[i]]]

