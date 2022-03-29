 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        x = list(set(nums))
        nums[:len(x)] = sorted(x)

        return len(x)

