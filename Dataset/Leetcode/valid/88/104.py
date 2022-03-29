 class Solution:
    def XXX(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: void Do not return anything, modify nums1 in-place instead.
        """
        i = m+n-1
        
        while i>=0:
            if n==0:
                break
            if m ==0:
                nums1[:n] = nums2[:n]
                break
            if nums1[m-1]>=nums2[n-1]:
                nums1[i] = nums1[m-1]
                m -=1
            else:
                nums1[i] = nums2[n-1]
                n-=1
            i -= 1

