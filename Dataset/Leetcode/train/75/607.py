 class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        lt = -1
        gt = n
        i = 0
        while i < gt :
            if nums[i] == 0:
                lt += 1
                nums[lt],nums[i] = nums[i],nums[lt]
                i += 1
            elif nums[i] == 2 :
                gt -= 1
                nums[gt],nums[i] = nums[i],nums[gt]
            else :
                i += 1

