 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        left,right = 0, len(nums)-1
        while left <= right:
            if nums[left] == val:
                nums[left] = nums[right]
                right-=1
            else:
                left+=1
        return left

