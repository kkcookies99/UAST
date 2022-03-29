 class Solution(object):
    def XXX(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        i = 0
        j = 0
        nums1 = nums1[0:m]
        while j < n:
            while nums1[i] < nums2[j]:
                i += 1
                if i > n+j-1:
                    break
            nums1.insert(i,nums2[j])
            j += 1

