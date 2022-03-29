 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        tmp = len(nums)//2
        if target < nums[0]:return 0
        elif target > nums[len(nums)-1]:return len(nums)
        elif nums[tmp-1] == target:return tmp-1
        elif nums[tmp] == target:return tmp
        elif nums[tmp-1] < target < nums[tmp]:return tmp
        elif target < nums[tmp-1]:
            nums = nums[:tmp-1]
            return XXX(nums,target)
        elif target > nums[tmp]:
            nums = nums[tmp:]
            return XXX(nums,target)

