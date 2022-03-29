 class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        index = 0
        len_all = len(nums)    
        while(index<len_all):    
            if nums[index] == 0:
                nums.pop(index)
                nums.insert(0,0)
                index = index+1
            elif nums[index] == 1:
                index = index + 1
            elif nums[index] == 2:
                nums.pop(index)
                nums.insert(len(nums), 2)
                len_all = len_all-1
        return nums

