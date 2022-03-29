 class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        count0 = 0
        for i in range(len(nums)):
            if nums[i] == 1:
                nums.insert(count0, nums.pop(i))
            elif nums[i] == 0:
                count0 += 1
                nums.insert(0, nums.pop(i))

