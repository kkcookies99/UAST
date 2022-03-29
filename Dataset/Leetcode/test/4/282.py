 class Solution(object):
    def XXX(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        i = len(nums1) - 1
        j = len(nums2) - 1
        end = len(nums1) + len(nums2) - 1
        nums1 = nums1 + [0]*len(nums2)
        #合并并从小到大排序
        while j >= 0 :
            if i >= 0 and nums1[i] > nums2[j]:
                nums1[end] = nums1[i]
                end -= 1
                i -=1
            else:
                nums1[end] = nums2[j]
                end -= 1
                j -=1
        #取中位数
        rs = 0.0
        if len(nums1)%2 == 1:
            rs = nums1[(len(nums1)-1)/2]
        else:
            rs = (nums1[(len(nums1)-1)/2]+nums1[len(nums1)/2])/2.0
        return rs

