class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums) < 2:
            return nums
        bound = 1
        left = -1
        right = len(nums)
        i = 0
        while i < right:
            if nums[i] > bound:
                t = nums[right-1]
                nums[right-1] = nums[i]
                nums[i] = t
                right -= 1
            elif nums[i] < bound:
                t = nums[left+1]
                nums[left+1] = nums[i]
                nums[i] = t
                left += 1
                i += 1
            else:
                i += 1


