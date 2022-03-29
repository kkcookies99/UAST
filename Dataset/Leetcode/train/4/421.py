 class Solution(object):
    def XXX(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        minValue = -1
        maxValue = 999999999999999999999999
        len1 = len(nums1)
        len2 = len(nums2)
        size = len1 + len2
        if len1 > len2:
            len1, len2, nums1, nums2 = len2, len1, nums2, nums1
        cutL = 0
        cutR = len1
        cut1 = len1 // 2
        cut2 = size // 2 - cut1
        while cut1 <= len1:
            L1 = minValue if cut1 == 0 else nums1[cut1 - 1]
            R1 = maxValue if cut1 == len1 else nums1[cut1]
            L2 = minValue if cut2 == 0 else nums2[cut2 - 1]
            R2 = maxValue if cut2 == len2 else nums2[cut2]
            if L1 > R2:
                cutR = cut1 - 1
            elif L2 > R1:
                cutL = cut1 + 1
            else:
                if size % 2 == 0:
                    l = max(L1, L2)
                    r = min(R1, R2)
                    return (l + r) / 2
                else:
                    return min(R1, R2)
            cut1 = (cutR - cutL) // 2 + cutL
            cut2 = size // 2 - cut1


