 class Solution(object):
    def XXX(self, nums1, m, nums2, n):
        if m == 0:
            for i in range(n):
                nums1[i] = nums2[i]
        elif n > 0:
            idx = len(nums1)-1
            while m and n:
                if nums1[m-1] <= nums2[n-1]:
                    nums1[idx] = nums2[n-1]
                    n-=1
                else:
                    nums1[idx] = nums1[m-1]
                    m-=1
                idx-=1
            while n:
                nums1[idx] = nums2[n-1]
                n-=1
                idx-=1

