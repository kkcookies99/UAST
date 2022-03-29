 class Solution(object):
    def XXX(self, nums, target):
        nums.sort()
        if target in nums: 
            return nums.index(target)
        else: 
            for i in range (len(nums)):
                if target > nums [-1]:
                    nums.append(target)
                    return  nums.index(target)
                elif target < nums[0]:
                    return  0
                elif nums[i] > target:
                    return  i

