class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        if not nums:
            return
        
        l_nums = len(nums)
        n_0 = 0
        n_1 = 0
        n_2 = 0
        
        for i in range(l_nums):
            if nums[i] == 0:
                n_0 += 1
                nums.pop(i)
                nums.insert(0, 0)
            elif nums[i] == 1:
                n_1 += 1
                nums.pop(i)
                nums.insert(n_0, 1)
            else:
                n_2 += 1
                nums.pop(i)
                nums.insert(n_0+n_1, 2)
        
        return

