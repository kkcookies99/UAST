 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """   
        if m == 0:
            for i in range(n):
                nums1[i] = nums2[i]
        else:
            p = 0 # nums1中数字与后面0换的次数
            q = 0 # nums2中数字与nums1中数字换的次数
            for i in range(m+n):
                if p<m and q<n:
                    if nums1[m-1-p]>=nums2[n-1-q]:
                        nums1[m+n-1-i] = nums1[m-1-p]
                        nums1[m-1-p] = 0
                        p = p + 1
                    else:
                        nums1[m+n-1-i]=nums2[n-1-q]
                        nums2[n-1-q] = 0
                        q = q + 1
                elif p == m and q<n:
                    nums1[m+n-1-i] = nums2[n-1-q]
                    nums2[n-1-q] = 0
                    q = q + 1

