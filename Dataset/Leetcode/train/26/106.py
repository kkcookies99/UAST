 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not len(nums):
            return len(nums)
        tmp = nums[0]
        index = 0
        for i, v in enumerate(nums):
            if tmp == v:
                continue
            else:
                nums[index] = tmp
                tmp = v
                index += 1
        nums[index] = tmp
        return len(nums[:index+1])

