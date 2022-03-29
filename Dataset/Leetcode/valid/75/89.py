class Solution(object):
    def XXX(self,nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        l_point = -1
        r_point = len(nums)

        i = 0
        while i < len(nums) and i < r_point:
            if nums[i] == 0 and i > l_point:
                l_point += 1
                nums[l_point],nums[i] = nums[i],nums[l_point]
            elif nums[i] == 2:
                r_point -= 1
                nums[r_point],nums[i] = nums[i],nums[r_point]

            else:
                i += 1
        return nums