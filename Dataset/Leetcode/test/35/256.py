 class Solution(object):
    def XXX(self, nums, target):
        n=len(nums)
        left,right=0,n-1
        while left<=right:
            mid=(left+right)//2
            # print(left,right,mid)
            if  nums[mid]==target:
                return mid
            elif nums[mid]>target:
                right=mid-1
            elif nums[mid]<target:
                left=mid+1
        return left

