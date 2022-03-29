class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        pointer_0 = 0
        for i in range(len(nums)):
           if nums[i] == 0:
               nums[i], nums[pointer_0] = nums[pointer_0], nums[i]
               pointer_0 += 1
        pointer_1 = pointer_0
        for j in range(pointer_0,len(nums)):
            if nums[j] == 1:
                nums[j], nums[pointer_1] = nums[pointer_1], nums[j]
                pointer_1 += 1
                


