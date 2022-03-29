 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # 千万不能使用del(nums[i])的方法，一边删一边循环，肯定出错
        if len(nums) == 0:
            return 0
        pre_index = 0
        for index, num in enumerate(nums):
            if num == nums[pre_index]:
                continue
            else:
                pre_index += 1
                nums[pre_index] = num
        return pre_index + 1

