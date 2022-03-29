 class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        for i in nums:
            if i == 1:
                nums.pop(nums.index(i))
                nums.append(1)
        for j in nums:
            if j == 2:
                nums.pop(nums.index(j))
                nums.append(2)
        return nums
