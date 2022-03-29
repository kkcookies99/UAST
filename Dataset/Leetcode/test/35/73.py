 class Solution(object):
    def XXX(self, nums, target):
        j=len(nums)-1
        for i in range(j):
            if target==nums[i]:
                return i
            else:
                if target>nums[i] and target<nums[i+1]:
                    return i+1
                else:
                    if target<nums[0]:
                        return 0
                    else:
                        return j
                    

