 class Solution(object):
    def XXX(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        if n == 0:
            return nums1
        j = 0
        for k in range(len(nums1)):
            if nums1[k] == 0:
                nums1[k] = nums2[j]
                j = j+1
                if j == n:
                    break

        return nums1.sort()
                

