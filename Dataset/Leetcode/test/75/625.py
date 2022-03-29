 class Solution:
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        l = len(nums)
        start = 0
        while start < l:
            item = nums[start]
            if item == 0:
                val = nums.pop(start)
                nums.insert(0,val)
                start += 1
            elif item == 1:
                start += 1
            else:
                val = nums.pop(start)
                nums.append(val)
                l -= 1

