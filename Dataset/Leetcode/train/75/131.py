class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        temp = 0
        for i in range(len(nums)):
            if temp:
                i -= temp
            if nums[i] == 0:
                nums.pop(i)
                nums.insert(0, 0)
            elif nums[i] == 2:
                temp += 1
                nums.pop(i)
                nums.append(2)

