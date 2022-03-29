 class Solution(object):
    def XXX(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        nums = nums1 + nums2
        nums.sort()
        length = len(nums)
        total = nums[length//2 - (1 - length%2 ):length//2+length%2+(1 - length%2 )]
        return float(sum(total))/len(total)

