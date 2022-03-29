 class Solution(object):
    def XXX(self, nums, target):
        left,right = 0,len(nums)
        while left<right:
            mid = (left+right)//2
            if nums[mid] >= target:
                right = mid
            else:
                left = mid+1
        return left

