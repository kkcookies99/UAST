 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        n = len(nums)
        left,right = 0,n-1 
        while left<=right:
            mid = left+(right-left)//2
            if nums[mid]==target:
                return mid 
            elif nums[mid]>target:
                right = mid-1
            else:
                left = mid+1
        return left 

