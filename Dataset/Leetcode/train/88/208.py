 class Solution(object):
    def XXX(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        index1 = m - 1
        index2 = n - 1
        
        index = len(nums1) - 1
        while index2 > -1:
            if index1 < 0:
                nums1[0:index2+1] = nums2[0:index2+1]
                break
            if nums1[index1] < nums2[index2]:
                nums1[index] = nums2[index2]
                index2 -= 1
            else:
                nums1[index],nums1[index1] = nums1[index1],nums1[index]
                index1 -= 1
            index -= 1

