 class Solution:
    def XXX(nums,target):
        for i in range(len(nums)):
            for j in range(len(nums)):
                if (target - nums[i]) == nums[j] and j != i:
                    return [j,i]
                else:
                     return []


