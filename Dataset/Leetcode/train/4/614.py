 class Solution(object):
    def XXX(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        nums = sorted(nums1 + nums2)
        lens = len(nums) - 1
        i = lens / 2
        j = i + lens % 2
        return (nums[i] + nums[j]) / 2.0

