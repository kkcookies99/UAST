 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(set(nums))
        i = 0
        while i < n - 1:
            if nums[i] == nums[i+1]:
                temp = nums[i+1]
                nums[i+1:len(nums)-1] = nums[i+2:]
                nums[-1] = temp
                continue
            else:
                i +=1
        return n, nums[:n]

