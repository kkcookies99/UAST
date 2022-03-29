 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        if target > nums[-1]:
            return len(nums)
        elif target <= nums[0]:
            return 0
        left,right = 0,len(nums)-1
        mid = (left+right)//2
        while left +1 < right:
            if target > nums[mid]:
                left = mid
            else:
                right = mid
            mid = (left+right)//2
        return mid+1

