 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        nums = {}
        max_len, re = 0, 0
        for i, c in enumerate(s, 1):
            if c in nums:
                re = max(nums[c], re)
            nums[c] = i
            max_len = max(max_len, i-re)
        return max_len

