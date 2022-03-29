 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        if m == 0:
            nums1[:] = nums2[:]
            return 
        i = 0
        j = 0
        while j != n:
            if nums2[j] <= nums1[i]:
                nums1[i+1:m+1] = nums1[i:m]
                nums1[i] = nums2[j]
                j += 1
                m += 1
            if i == m - 1:
                nums1[i+1:] = nums2[j:]
                break
            i += 1

