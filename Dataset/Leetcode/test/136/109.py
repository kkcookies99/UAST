 class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # 排序 
        nums = sorted(nums)
        
        i = 0
        while i < len(nums)-1:
            if nums[i] != nums[i+1]:  # 相邻两个数进行比较
                return nums[i]
            
            i = i + 2
        
        # 如果已达最后一个数，直接返回
        return nums[i]
            

