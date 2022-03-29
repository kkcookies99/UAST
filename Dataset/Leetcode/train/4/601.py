 class Solution(object):
    def XXX(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        array1 = nums1 + nums2
        array1.sort()
        if len(array1) % 2 != 0:
          return array1[len(array1) / 2]
        else:
          return (array1[len(array1) / 2] + array1[(len(array1) / 2) - 1]) / 2.0


