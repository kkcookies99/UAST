 class Solution(object):
    def XXX(self, nums1, m, nums2, n):
        #O(n)
        loc1 = m - 1
        loc2 = n - 1
        loc = m + n - 1
        while loc2 >= 0:
            nums1[loc] = nums1[loc1] if loc1 >= 0 and nums1[loc1] > nums2[loc2] else nums2[loc2]
            if loc1 >= 0 and nums1[loc1] > nums2[loc2]:
                loc1 -= 1
            else:
                loc2 -= 1
            loc -= 1

