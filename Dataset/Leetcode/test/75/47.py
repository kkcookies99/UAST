class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        num0 = 0
        num1 = 0
        num2 = 0
        n = len(nums)
        for i in range(n):
            if nums[i] == 0:
                num0 += 1
            elif nums[i] == 1:
                num1 += 1
            else:
                num2 += 1
        
        for i in range(num0):
            nums[i] = 0
        for i in range(num1):
            nums[i + num0] = 1
        for i in range(num2):
            nums[i + num0 + num1] = 2

