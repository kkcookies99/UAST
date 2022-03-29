 class Solution(object):
        for i in range(len(nums)-1, -1, -1):
            if nums[i] == val:
                del nums[i]
        return len(nums)