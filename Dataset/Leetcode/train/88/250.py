 class Solution(object):
    def XXX(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        if n==0:
            pass
        else:
            for i in range(n):                
                nums1.pop()
            nums1.extend(nums2)
        nums1.sort()

