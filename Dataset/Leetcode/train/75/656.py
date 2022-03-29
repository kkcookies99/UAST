 class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        index = 0
        for i in range(len(nums)):
            if nums[i]<1:
                nums[i] , nums[index] = nums[index], nums[i]
                index +=1
        new = index
        for i in range(new,len(nums) ):
            if nums[i]< 2:
                nums[i] , nums[index] = nums[index], nums[i]
                index += 1

