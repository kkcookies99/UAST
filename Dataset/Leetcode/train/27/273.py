 class Solution(object):
    def XXX(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        i = 0
        try:
            while i >= 0:
                if nums[i] == val:
                    del nums[i]

                else:
                    i += 1
        except:
            return len(nums)
`
