 class Solution:
    def XXX(self, nums1, m, nums2, n):
        i = m-1
        j = n-1
        while j >= 0:  
            while i >= 0:
                if nums1[i] >= nums2[j]:
                    nums1[i+j+1] = nums1[i]
                    i -= 1
                else:
                    break
            nums1[i+j+1] = nums2[j]
            j -= 1

