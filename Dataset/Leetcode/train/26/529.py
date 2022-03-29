 class Solution:
    def XXX(self, nums):
        """考虑了列表中元素是已经排好顺序的（升序或者降序）
        :type nums: List[int]
        :rtype: int
        """
        i = 0     # i为慢指针
        j = 1     # j为快指针
        while j < len(nums):
            if nums[i] == nums[j]:
                nums.pop(j)
            else:    
                i = i + 1
                j = i + 1
        return len(nums)

