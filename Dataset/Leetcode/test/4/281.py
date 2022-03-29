 class Solution(object):
    def XXX(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        num=nums2+nums1
        num.sort()
        

        if len(num) % 2 == 0:
            return (num[int(len(num) / 2)] + num[int(len(num) / 2 - 1)]) / 2
        else:
            return num[int(len(num) / 2)]

