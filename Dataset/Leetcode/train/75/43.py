class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        red = 0
        white = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                red += 1
            elif nums[i] == 1:
                white += 1
        for i in range(len(nums)):
            if i < red:
                nums[i] = 0
            elif i < (red+white):
                nums[i] = 1
            else:
                nums[i] = 2

