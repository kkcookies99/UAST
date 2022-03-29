 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        left,right = len(nums)-2,len(nums)-1
        while left>=0:
            if nums[left] >= right - left:
                right = left
            left -= 1
        return right == 0

