 class Solution(object):
    def XXX(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """

        # 定义count用来判断
        count = 0

        for i in range(len(nums)):
            if nums[i] != val:
                nums[count] = nums[i]
                count += 1
        
        return count

